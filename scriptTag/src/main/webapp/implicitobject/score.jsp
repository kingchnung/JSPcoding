<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Insert title here</title>
		<link href="../image/icon.png" rel="icon" type="image/x-icon" />
	</head>
	<body>
	<%
	int score = Integer.parseInt(request.getParameter("score"));
	char grade = ' ';
	if(score >= 90) {
		grade = 'A';
	} else if(score >= 80) {
		grade = 'B';
	} else if(score >= 70) {
		grade = 'C';
	} else if(score >= 60) {
		grade = 'D';
	} else {
		grade = 'F';
	}
	%>
	
		입력한 점수는 <%=score%>입니다. <br />
		학점은 <%=grade %>입니다.
		
	</body>
</html>