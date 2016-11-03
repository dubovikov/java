package com.packt.webstore.interceptor;

import org.apache.log4j.Logger;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Julivi on 26.10.2016.
 */
public class PerformanceMonitorInterceptor implements HandlerInterceptor {
    ThreadLocal<StopWatch> stopWatchThreadLocal=new ThreadLocal<>();
    Logger logger=Logger.getLogger(this.getClass());
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        StopWatch stopWatch=new StopWatch(o.toString());
        stopWatch.start(o.toString());
        stopWatchThreadLocal.set(stopWatch);
        logger.info("Accessing URL path: "+ getURLPath(httpServletRequest));
        logger.info("Request processing started on: "+getCurrentTime());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        StopWatch stopWathc=stopWatchThreadLocal.get();
        stopWathc.stop();
        logger.info("Total time taken for processing: "+stopWathc.getTotalTimeMillis()+ " ms");
        stopWatchThreadLocal.set(null);
        logger.info("=======================================================");
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("Request processing ended on " +getCurrentTime());
    }

    private String getURLPath(HttpServletRequest httpServletRequest) {
        String currentPath=httpServletRequest.getRequestURI();
        String queryString=httpServletRequest.getQueryString();
        queryString = queryString == null ? "" : "?" + queryString;
        return currentPath+queryString;
    }


    public String getCurrentTime() {
        DateFormat formatter=new SimpleDateFormat("dd/mm/yyyy 'at' hh:mm:ss");
        Calendar calendar=Calendar.getInstance();
        return formatter.format(calendar.getTime());
    }
}
