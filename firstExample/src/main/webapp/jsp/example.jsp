<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<link rel="shortcut icon" href="../image/icon.png">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
<h1>숫자 3개중 최댓값 출력</h1>
<h3>3, 6, 10</h3>
	<%
	int a = 3;
	int b = 6;
	int c = 10;
	int max = 0;
	
	max = Math.max(a, b);
	max = Math.max(max, c);
	out.print("최댓값 = <h1>" + max + "</h1>");
	out.print("<hr />");
	out.print("<h1>배열의 값(12, 26 ,68 ,98, 76, 54, 8, 6, 4) 중 최댓값 최솟값 구하기");
	int[] arr = {12, 26 ,68 ,98, 76, 54, 8, 6, 4};
	int resultMax = 0;
	int resultMin = Integer.MAX_VALUE;
	
	for(int i : arr) {
		resultMax = Math.max(resultMax, i);
		resultMin = Math.min(resultMin, i);
	}
	
	out.print("<h3>최댓값 = " + resultMax + "</h3>");
	out.print("<h3>최솟값 = " + resultMin + "</h3>");
	out.print("<hr />");
	%>
</body>
</html>