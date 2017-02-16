$(document).ready(function() {

	$('body').bind('click', function(e) {
	    if($(e.target).closest('.chosen-tag').length == 0) {
	    	$('.tags-border').empty();
	    	$('.tags-border').css("display", "none");
	    }
	});
});

//timer identifier
var typingTimer;

//time in ms, 3 seconds
var doneTypingInterval = 1000;

//on keyup, start the countdown
function tagSearch(e) {
	var tagSearchText = $(e).val();
	clearTimeout(typingTimer);
	typingTimer = setTimeout(doneTagTyping(tagSearchText), doneTypingInterval);
}

function tagSearchUp(e) {
	var tagSearchText = $(e).val();
	if (tagSearchText && tagSearchText.trim().length > 0) {
		clearTimeout(typingTimer);
		typingTimer = setTimeout(doneTyping, doneTypingInterval);
	} else {
		$(e).val('');
		$('.tags-border').empty();
	}
}

// on keydown, clear the countdown
function tagSearchDown() {
	clearTimeout(typingTimer);
}

//user is "finished typing," do something
function doneTyping() {
	var url = "/stackoverflow-web/tags?name=" + $('#post-ask-tags').val();
	$.ajax({
		url : url,
		type : "GET",
		success : function(data) {
			$(".tags-border").css("display", "block");
			$(".tags-border").html(data);
		}
	});
}

//user is "finished typing," do something
function doneTagTyping(tagText) {
	var url = "/stackoverflow-web/tags";
	if (tagText && tagText.trim().length > 0)
		url += "?name=" + tagText;
	else
		url += "/all";
	$.ajax({
		url : url,
		type : "GET",
		success : function(data) {
			$(".questions").html(data);
		}
	});
}

function addTag(e) {
	var tagName = $(e).find('.qtags a').text();
	var tagId = "tag" + $(e).attr('id');
	$('#chosen-tag-list').append('<span class=\"post-tag" id ="'
			+ tagId + '" onclick="deleteTag(this);">'
			+ tagName + '<span class="delete-tag" id="12" title="remove this tag"></span></span>');
}

function deleteTag(e) {
	e.remove();
}