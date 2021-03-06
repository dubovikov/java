<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please sign in</h3>
                </div>
                <div class="panel-body">
                    <c:if test="${not empty param.login_error}">
  <span style="color: red; ">
    Your login attempt was not successful, try again.<br/><br/>
    Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
  </span>
                    </c:if>
                    <form action="<c:url value='login'/>" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="User Name" name='username'  type="text">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name='password' type="password">
                            </div>
                            <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
                            <input type="hidden" name="<c:out value="${_csrf.parameterName}"/>"
                                   value="<c:out value="${_csrf.token}"/>"/>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
