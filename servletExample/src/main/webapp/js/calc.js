/**
 * 
 */
$("#btnCalc").on("click", function(){
	const numberPattern = /^-?\d+(\.\d+)?$/;
	
	if($("#num1").val().replace(/\s/g, "")==""){
		alert("숫자를 입력해 주세요");
		$("#num1").val("");
		$("#num1").focus();
		return;
	} else {
		if($("#num1").val().search(numberPattern) < 0) {
			alert("문자를 입력할 수 없습니다.");
			$("#num1").val("");
			$("#num1").focus();
			return;
		}
	}
	
	if($("#num2").val().replace(/\s/g, "")==""){
			alert("숫자를 입력해 주세요");
			$("#num2").val("");
			$("#num2").focus();
			return;
		} else {
			if($("#num2").val().search(numberPattern) < 0) {
				alert("문자를 입력할 수 없습니다.");
				$("#num2").val("");
				$("#num2").focus();
				return;
			}
		}
		
		/*$("#frm").attr({
			"method" : "post",
			"action" : "/servletExample/calcServlet"
		});*/
		
		$.ajax({
			url:"/servletExample/calcServlet2",
			method:"post",
			data:{
				"num1":$("num1").val(),
				"operator":$("#operator").val(),
				"num2":$("#num2").val()
			},
			dataType:"text"
		}).done(function(data){
			$("#result").val(data);
		}).fail(function(xhr, status){
			alert(status + " 발생.\n상태: " + xhr.status);
		});
});