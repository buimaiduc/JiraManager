<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@	taglib prefix="spring"	uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JIRA Manager</title>
<link rel="icon" href="<c:url value="/resources/images/jira.ico" />" type="image/x-icon">
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/dropzone.css" />" rel="stylesheet">
<script src="<c:url value="/resources/ckeditor/ckeditor.js" />" type="text/javascript" ></script>
<script src="<c:url value="/resources/js/jquery-1.12.2.min.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/sto.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dropzone.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />" type="text/javascript"></script>
</head>
<body>
	<div class="container tempate">
		<div class="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="body">
			<tiles:insertAttribute name="body" />
		</div>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>