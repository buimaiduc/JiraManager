<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<div class="col-md-9 col-md-offset-1">
	<form action="<c:url value="/tags/add" />" method="post">
		<div class="form-group">
			<label for="tName">Tag Name</label>
			<input type="text" name="tagName" class="form-control" id="tName" placeholder="What's tag's name?">
		</div>
		<div class="form-group">
			<label for="tagDescription">Description</label>
			<input type="text" name="tagDescription" class="form-control" id="tagDescription" placeholder="What's tag's description?">
		</div>

		<button type="submit" class="btn btn-primary">Add tag</button>
	</form>
</div>