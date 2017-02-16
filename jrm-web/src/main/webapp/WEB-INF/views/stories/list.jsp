<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <div>
    <h1>Story Listing</h1>

    <c:if test="${not empty contacts}">
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Summary</th>
                <th>Link</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${stories}" var="story">
                <tr>
                    <td>${story.id}</td>
                    <td>${story.summary}</td>
                    <td>${story.link}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JIRA Manager</title>
<link rel="icon" href="<c:url value="/resources/images/jira.ico" />" type="image/x-icon" >
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
<script src="<c:url value="/resourcs/js/jquery-1.12.2.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="story-list">
			<div class="col-md-10 col-md-offset-1">
				<div class="subheader">
					<div class="subheader-child">
						<h3>All Stories</h3>
					</div>
					<div class="row">
						<div class="col-md-1">
							<a href="<c:url value="/posts/" />">
								<img class="logo" alt="" src="<c:url value="/resources/imgs/stackoverflow.png" />" />
							</a>
						</div>
						<div class="col-md-4 col-md-offset-8 menu">
							<a class="btn btn-default" href="<c:url value="/list" />" role="button">Stories</a>
							<a class="btn btn-default" href="<c:url value="/tags" />" role="button">Tags</a>
							<a class="btn btn-default" href="<c:url value="/add" />" role="button">Add story</a>
						</div>
					</div>
				</div>
				<div class="questions">
				<c:forEach items="${stories}" var="story">
					<div class="story-item">
						<div class="col-md-1 qstatus">
							<div class="qstitem qstanswer">
								<h5>${story.storyNumber}</h5>
							</div>
							<div class="qstitem">
								<strong>Location</strong>
							</div>							
						</div>
						<div class="col-md-11">
							<div><a href=""><h4>${story.summary}</h4></a></div>
							<div>
								<blockquote><h5>I have an iOS app in the app store that can download relatively large files that need to stay on the device for offline use. Those files are currently stored in the app's Documents folder but I'm just ...</h5></blockquote></div>
							<div>
								<div class="col-md-8">
									<div class="qtags"><a href="">ios</a></div>
									<div class="qtags"><a href="">java</a></div>
									<div class="qtags"><a href="">jsp</a></div>
								</div>
								<div class="col-md-4 quser">
									<div><h6>created ${story.creationDate}</h6></div>
									<img class="quserimg" alt="" src="<c:url value="/resources/imgs/user1.jpg"/>" />
									<a href="">Duc Bui</a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>
</html>