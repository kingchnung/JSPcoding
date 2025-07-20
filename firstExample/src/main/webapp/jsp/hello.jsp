<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8" />
		<title>JSP 첫문서 작성하기 - hello.jsp</title>
		<link rel="shortcut icon" href = "../image/icon.png" />
	</head>
	<body>
	<%
	String[] str = {"안", "녕", "하", "세", "요", "."};
	
	
		for(int i =0; i<6; i++) {
			out.print("<h" + (i + 1) + ">"+ str[i] +"</h" + (i + 1) + ">");
		}
	%>
	<div>
		<img alt="춘봉이" src="../image/고화질춘봉.jpg" />
	</div>
	</body>
</html>