/**
 * 
 */
$("#btn").on("click", function() {
	if ($("#title").val().replace(/\s/g, "") == "") {
		alert("책 제목을 입력해주세요.");
		$("#title").val("");
		$("#title").focus();
		return;
	}
	if ($("#author").val().replace(/\s/g, "") == "") {
		alert("책 저자를 입력해주세요.");
		$("#author").val("");
		$("#author").focus();
		return;
	}
	if ($("#publisher").val().replace(/\s/g, "") == "") {
		alert("책 제목을 입력해주세요.");
		$("#publisher").val("");
		$("#publisher").focus();
		return;
	}
	
	$("#bookForm").attr({
		"method" : "post",
		"action" : "/servletExample/bookInput"
	});
	
	$("#bookForm").submit();
});