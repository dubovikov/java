<%--
  Created by IntelliJ IDEA.
  User: Evgen
  Date: 10.10.2016
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

    <title>Customers</title>

</head>
<body>

<section class="container">
    <div class="row">
        <c:forEach items="${customers}" var="customer">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${customer.name}</h3>
                        <p>${customer.address}</p>
                        <p>${customer.customerId}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
