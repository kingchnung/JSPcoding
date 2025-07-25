<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
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
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			String URL = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8";
			String keyword = request.getParameter("word");
			URL += "&query=" + keyword;
			response.sendRedirect(URL);
		%>
	</body>
</html>