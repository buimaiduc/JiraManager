<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
	<div class="story-list">
		<div class="col-md-10 col-md-offset-1">
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