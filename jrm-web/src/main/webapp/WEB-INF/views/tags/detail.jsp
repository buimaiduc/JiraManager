<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form action="<c:url value="/tags/amend" />" method="post">
	<div class="col-md-9 col-md-offset-1">
		<div class="form-group">
			<label>Tag ID</label>
			<div>${tag.id}</div>
			<input type="hidden" name="tagId" value="${tag.id}" />
		</div>
		<div class="form-group">
			<label>Tag Name</label>
			<div>${tag.name}</div>
		</div>
		<div class="form-group">
			<label>Description</label>
			<div>${tag.description}</div>
		</div>

		<button type="submit" name="operation" value="Update" class="btn btn-primary">Update tag</button>
		<button type="submit" name= "operation" value="Delete" class="btn btn-primary" onclick="return confirm('Are you sure?');" >Delete tag</button>
	</div>
</form>