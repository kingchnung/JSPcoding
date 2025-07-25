/**
 * 
 */
$("#sendBtn").on("click",function(){
	 
	
	if($("#word").val().replace(/\s/g, "") === "") {
		$("#result").html("키워드를 입력해주세요.").css("color", "red");
		$("#word").val("");
		$("#word").focus();
	} else {
		$("#form1").attr({
				method:"get",
				action:"/scriptTag/jsp/sendredirect.jsp"
			});
			$("#form1").submit();
	}
});