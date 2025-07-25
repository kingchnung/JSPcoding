<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>JSP 예제 - scriptlet.jsp</title>
		<link href="../image/icon.png" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<h4>JSP로 구현한 구구단 - 단을 입력받아 해당하는 단만 출력</h4>
		<%
		int dan = 2;
		if(request.getParameter("dan") != null) {
			dan=Integer.parseInt(request.getParameter("dan"));
		}
		
		if(dan >= 1 && dan <=9) {
			for(int i = 1; i <= 9; i++) {
		%>
				<%= dan %> x <%=i %> = <%=dan * i %><br />
		<%
			}
		%>
		<hr />
		<%
		for(int i=1; i<=9;i++){
			out.print(dan + " x " + i + " = " + dan*i + "<br>");
		}
		} else {
			%>
			<h5 style="color:red">1에서 9사이의 값을 입력해 주세요</h5>
			<%
		}			
			%>
			
			<h4>스크립트릿을 이용한 구구단 2 ~ 9 단까지 전부 출력 - 1</h4>
			<%
			int i, j, k;
			out.println("<table border = '1'>");
			for(i = 1; i <= 9; i++) {
				out.println("<tr>");
				for(j = 2; j <=9; j++) {
					k = i * j;
					out.println("<td>");
					out.println(i + " * " + j + " = " + k);
					out.println("</td>");
				}
				out.println("</tr>");
			}
			out.println("</table>");
			%>
		
		<h4>스크립트릿을 이용한 구구단 2 ~ 9 단까지 전부 출력 - 2</h4>
		<table border ="1">
			<%for(i = 1; i <=9; i++) {%>		
					<tr>
					<% for(j=2; j<=9;j++){
							k= i*j;
					%>
					<td>
					<%--out.println(j + " * " + i + " = " + k); --%>
					<%--= j + " * " + i + " = " + k  --%>
					<%= j  %> * <%=i %> = <%=k %>
					</td>
				<% 
					}
					%>
					</tr>
				<%} %>
		</table>
	</body>
</html>