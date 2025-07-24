<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>스크립트 확인 - time.jsp</title>
	</head>
	<body>
		<h2>첫 번째 JSP 테스트 예제입니다.</h2>
		<hr />
		오늘 날짜 : <%= LocalDate.now() %><br />
		<%
			LocalTime time = LocalTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			
		%>
		현재 시간 : <%= time.format(formatter) %><br />
		
		<%
			String name = "홍길동";
			out.print(name);
		%>
	</body>
</html>