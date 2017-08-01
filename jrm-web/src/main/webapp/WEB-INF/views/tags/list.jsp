<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
	<div class="story-list">
		<div class="col-md-10 col-md-offset-1">
			<div class="questions">
				<c:forEach items="${tags}" var="tag">
					<a href="<c:url value="/tags/show/${tag.id}" />">
						<div class="tag-cell chosen-tag" id="${tag.id}">
							<div class="qtags">${tag.name}</div>x 1096443
							<div class="qtags_content">
								<span>
									${tag.description}
								</span>
							</div>
						</div>
					</a>
				</c:forEach>
			</div>
		</div>
	</div>
</div>