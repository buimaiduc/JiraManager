<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-md-9 col-md-offset-1">
	<form action="<c:url value="/posts/ask" />" method="post">
		<div class="form-group">
			<label for="postTiltle">Story Number</label>
			<input type="text" name="postTitle" class="form-control" id="postTiltle" placeholder="What's story's number?">
		</div>
	  	<div class="form-group">
	    	<label for="postTiltle">Summary</label>
	    	<input type="text" name="postTitle" class="form-control" id="postTiltle" placeholder="What's story's summary?">
	  	</div>
		<div class="form-group">
			<label for="postTiltle">Link</label>
			<input type="text" name="postTitle" class="form-control" id="postTiltle" placeholder="What's story's link?">
		</div>
	  
	  <label for="postTiltle">Description</label>
	  <textarea id="postBody1" name="postBody" class="form-control" rows="3"></textarea>
	  
	  <div class="form-group">
	    <label for="postTiltle">Attachments</label>
	    <!-- <input type="text" name="postTitle" class="form-control" id="postTiltle" placeholder="What's your programming question ? Be specific."> -->
	    <div class="fallback">
			<input name="file" type="file" />
		</div>
	  </div>
	  
	  <div class="form-group">
	    <label for="postTags">Tags</label>
	    <span id="chosen-tag-list"></span>
	    <input type="text" name="postTags" id="post-ask-tags" onkeyup="tagSearchUp(this);" onkeydown="tagSearchDown();" placeholder="at least on tag such as (core server model), max 5 tags" class="form-control" id="postTags">
	    <div class="tags-border"></div>
	  </div>
	  <!-- <div class="checkbox">
	    <label>
	      <input type="checkbox"> <strong>Send me new responses to my posts via email <a>(settings)</a></strong>
	    </label>
	  </div> -->
	  <button type="submit" class="btn btn-primary">Add story</button>
	</form>
	<ckeditor:replace replace="postBody" basePath="/resources/ckeditor/" />
</div>