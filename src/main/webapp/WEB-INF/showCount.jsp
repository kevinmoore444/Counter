<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>

</head>
<body>
	<h1>You have visited your home page <c:out value="${countToShow}"/> times</h1>
	<a href="/your_server/counter">See your count</a>
	<br/>
	<a href="/your_server">Increment count by 1</a>
	<br/>
	<a href="/your_server/counterPlusTwo">Increment count by 2</a>
	<br/>
	<a href="/your_server/reset">Reset the count</a>
</body>
</html>