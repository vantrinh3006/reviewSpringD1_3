<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/17/21
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xtra Blog</title>

    <c:url value="/teamplate" var="contextPath" scope="application"></c:url>

    <link rel="stylesheet" href="fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet"> <!-- https://fonts.google.com/ -->
    <link href="${contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/css/templatemo-xtra-blog.css" rel="stylesheet">
    <!--

    TemplateMo 553 Xtra Blog

    https://templatemo.com/tm-553-xtra-blog

    -->
</head>
<body>
<tiles:insertAttribute name="leftbar"></tiles:insertAttribute>
<div class="container-fluid">
    <main class="tm-main">
        <!-- Search form -->
        <tiles:insertAttribute name="search"></tiles:insertAttribute>
        <tiles:insertAttribute name="body"></tiles:insertAttribute>
        <tiles:insertAttribute name="footer"></tiles:insertAttribute>
    </main>
</div>
<script src="${contextPath}/js/jquery.min.js"></script>
<script src="${contextPath}/js/templatemo-script.js"></script>
</body>
</html>