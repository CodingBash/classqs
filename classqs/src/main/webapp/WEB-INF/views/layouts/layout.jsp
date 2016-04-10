<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>

<c:forEach var="style" items="${commonStyles}">
	<link rel="stylesheet" type="text/css" href="${style}"></link>
</c:forEach>

<tiles:useAttribute name="pageStyle" ignore="true" />
<c:if test="${not empty pageStyle}">
	<link rel="stylesheet" type="text/css" href="${pageStyle}"></link>
</c:if>
</head>
<body>
	
	
	<tiles:insertAttribute name="pageContent" />



	<tiles:useAttribute id="commonScripts" name="commonScripts" classname="java.util.List" />
	<c:forEach var="script" items="${commonScripts}">
		<script type="text/javascript" src="${script}"></script>
	</c:forEach>

	<tiles:useAttribute name="pageScript" ignore="true" />
	<c:if test="${not empty pageScript}">
		<script type="text/javascript" src="${pageScript}"></script>
	</c:if>
</body>
</html>