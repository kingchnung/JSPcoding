<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>JSP 예제 - declaration.jsp</title>
<link href="../image/icon.png" rel="icon" type="image/x-icon" />
</head>
<body>
	<%!double radius = 4.8;%>
	<%!
	//원의 면적을 구하는 메서드 (자바 주석이라서 서블릿에 전송됨)
	public double getArea(double r) {
	return r * r * 3.14;
}%>

	<%--위의 태그는 선언문으로 메서드의 선언이나 멤버변수를 정의하고자 할 때 사용.
	(JSP 주석이라서 자바, 서블릿으로 전송되지 않음.)  --%>
	반지름이
	<%=radius%>인 원의 면적은
	<%=getArea(radius)%>이다.
	<%!char getKorDay() {
		char result = ' ';
		int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

		switch (day) {
		case 1:
			result = '일';
			break;
		case 2:
			result = '월';
			break;
		case 3:
			result = '화';
			break;
		case 4:
			result = '수';
			break;
		case 5:
			result = '목';
			break;
		case 6:
			result = '금';
			break;
		case 7:
			result = '토';
		}
		return result;
	}%>
	<p>
		오늘은
		<%=getKorDay()%>요일입니다.
	</p>

	<p>
		<%int i = 0;%>
		<label>[지역변수/필드] i = <%=++i%></label>
	</p>
	<p>
		<label>[전역변수/필드] fieldi = <%=++fieldi%></label>
		<%!int fieldi = 0;%>
	</p>

	<%!
		int sum(int a, int b) {
			int sum = 0;
	
			for (int i = a; i <= b; i++) {
				sum += i;
			}
			return sum;
		}
	%>
	<p>
		<%="1부터 10까지 합은" + sum(1, 10) + " 입니다."%>
	</p>
</body>
</html>