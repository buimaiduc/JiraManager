<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="search-box col-md-11">
	<div class="col-xs-6 col-md-10 width100 col-md-offset-2">
		<form action="search" class="text-center col-md-10">
			<div class="col-md-2">
				<a href="<c:url value="/list" />">
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
	</div>
</div>