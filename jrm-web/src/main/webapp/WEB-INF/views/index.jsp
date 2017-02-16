<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JIRA Manager</title>
<link rel="icon" href="<c:url value="/resources/imgs/jira.ico" />" type="image/x-icon" >
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
<script src="<c:url value="/resourcs/js/jquery-1.12.2.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container col-xs-6 col-md-12 width100 vcenter">
		<form action="posts/search" class="text-center col-md-6 col-md-offset-3">
			<img class="img jr-img" src="<c:url value="/resources/imgs/stackoverflow00.jpg" />">
			<input type="text" name="q" class="input-md form-control" aria-describedby="basic-addon1">
			<button type="submit" class="btn btn-default btn-lg">Search</button>
		</form>
		<div class="col-md-1 col-md-offset-2 height100">
			<button type="button" class="btn btn-default" aria-label="Left Align">
				<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
			</button>
		</div>
	</div>
</body>
</html>