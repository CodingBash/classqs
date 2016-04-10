<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<spring:url value="/index" var="indexUrl" htmlEscape="true" />
<spring:url value="/profile" var="profileUrl" htmlEscape="true" />
<spring:url value="/about" var="aboutUrl" htmlEscape="true" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title><tiles:getAsString name="title" /></title>

<!-- BOOTSTRAP STYLE -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">


<tiles:useAttribute id="commonStyles" name="commonStyles" classname="java.util.List" />
<c:forEach var="commonStyle_" items="${commonStyles}">
	<link rel="stylesheet" type="text/css" href="${commonStyle_}"></link>
</c:forEach>

<tiles:useAttribute id="pageStyles" name="pageStyles" classname="java.util.List" />
<c:forEach var="pageStyle_" items="${pageStyles}">
	<link rel="stylesheet" type="text/css" href="${pageStyle_}"></link>
</c:forEach>
</head>
<body>

	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<spring:url value="/index" var="indexUrl" htmlEscape="true" />
				<a href="${indexUrl}" class="navbar-brand">ClassQs</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="${indexUrl}"><span class="glyphicon glyphicon-home"></span> Home</a></li>
					<li><a href="${profileUrl}"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
					<li><a href="${aboutUrl}"><span class="glyphicon glyphicon-pencil"></span> About</a></li>
				</ul>
			</div>
		</div>
	</div>

	<tiles:insertAttribute name="pageContent" />

	<!-- BOOTSTRAP SCRIPT -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous"></script>

	<!-- jQUERY SCRIPT -->
	<script src="https://code.jquery.com/jquery-2.2.3.min.js"
		integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo=" crossorigin="anonymous"></script>

	<tiles:useAttribute id="commonScripts" name="commonScripts" classname="java.util.List" />
	<c:forEach var="commonScript_" items="${commonScripts}">
		<script type="text/javascript" src="${commonScript_}"></script>
	</c:forEach>

	<tiles:useAttribute id="pageScripts" name="pageScripts" classname="java.util.List" />
	<c:forEach var="pageScript_" items="${pageScripts}">
		<script type="text/javascript" src="${pageScript_}"></script>
	</c:forEach>
</body>
</html>
