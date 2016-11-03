package com.packt.webstore.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Julivi on 26.10.2016.
 */
public class PromoCodeInterceptor extends HandlerInterceptorAdapter {
    private String promoCode;
    private String errorRedirect;
    private String oferRedirect;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String givenPromoCode=request.getParameter("promo")==null?" ": request.getParameterValues("promo")[0];
        if (request.getRequestURI().endsWith("products/specialOffer")){
            if (givenPromoCode.equals(promoCode)){
                response.sendRedirect(request.getContextPath()+"/"+oferRedirect);
            }else {
                response.sendRedirect(errorRedirect);
            }
            return false;
        }
        return true;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public void setErrorRedirect(String errorRedirect) {
        this.errorRedirect = errorRedirect;
    }

    public void setOferRedirect(String oferRedirect) {
        this.oferRedirect = oferRedirect;
    }

    public String getPromoCode() {

        return promoCode;
    }

    public String getErrorRedirect() {
        return errorRedirect;
    }

    public String getOferRedirect() {
        return oferRedirect;
    }
}
