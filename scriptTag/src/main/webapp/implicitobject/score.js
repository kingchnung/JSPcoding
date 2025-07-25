/**
 * 
 */
/*const form = document.getElementById("scoreForm");
const score = document.getElementById("score");

score.addEventListener("input", function(){
	score.setCustomValidity("");
});

form.addEventListener("submit", function(e){
	e.preventDefault();
	
	const pattern = /^(100|[1-9][0-9]?|0)$/;
	
	if(!pattern.test(score.value)) {
		score.setCustomValidity("점수는 0~100점으로 입력해 주세요.");
		score.reportValidity();
		score.value = "";
		return;
	}
	
	form.method = "post";
	form.action = "/scriptTag/score";
	
	form.submit();
})*/


$("#sendBtn").on("click", function(){
	const pattern = /^(100|[1-9][0-9]?|0)$/;
	if(!pattern.test($("#score").val())){
		alert("점수는 0 ~ 100점으로 입력해 주세요.");
		$("#score").val("");
		$("#score").focus();
		return;
	}
	
	$.ajax({
		url:"/scriptTag/implicitobject/score2.jsp",
		method:"post",
		data:$("#scoreForm").serialize(),
		dataType:"text"
	}).done(function(data){
		$("#result").val(data);
	}).fail(function(xhr, status){
		alert(status + " 발생.\n상태: " +xhr.status);
	});
});

