<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="search-box col-md-11">
	<div class="col-xs-6 col-md-11 width100 col-md-offset-1">
		<form action="search" class="text-center col-md-11 col-md-offset-1">
			<div class="col-md-2">
				<a href="<c:url value="/stories/list" />">
					<img class="img jr-img" src="<c:url value="/resources/images/jira.png" />">
				</a>
			</div>
			<div class="col-md-7 search-txt">
				<input type="text" name="q" class="input-md form-control mg-8x" aria-describedby="basic-addon1">
			</div>
			<div class=" col-md-1 search-btn-div">
				<button type="submit" class="btn btn-default btn-lg search-btn">Search</button>
			</div>			
		</form>
		<div class="subheader">
			<div class="subheader-child">
				<h3>All Stories</h3>
			</div>
			<div class="row">
				<div class="col-md-5 col-md-offset-7 menu">
					<a class="btn btn-default" href="<c:url value="/stories/list" />" role="button">Stories</a>
					<a class="btn btn-default" href="<c:url value="/stories/add" />" role="button">Add story</a>
					<a class="btn btn-default" href="<c:url value="/tags/list" />" role="button">Tags</a>
					<a class="btn btn-default" href="<c:url value="/tags/add" />" role="button">Add tag</a>
				</div>
			</div>
		</div>
	</div>
</div>