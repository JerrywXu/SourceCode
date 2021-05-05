<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>九九乘法表</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h2>
    66666
</h2>
<c:choose>
    <c:when test="${pageContext.session.getAttribute('uid')==null}">
        <li><a href="User/register" target="_blank">注册</a></li>
        <li><a href="#" data-toggle="modal" data-target="#myModal">登录</a></li>
    </c:when>
    <c:otherwise>
        <li><a href="User/usercenter">${pageContext.session.getAttribute("name")}</a></li>
        <li><a href="#" id="id-a-logout">登出</a></li>
    </c:otherwise>
</c:choose>
<h1>I'm test page 1</h1>
</body>
