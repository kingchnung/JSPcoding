<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
	
		<%
		String data = request.getParameter("score");
		int score = 0;
		if(data != null) {
			score = Integer.parseInt(data);
		}
		
		String grade = "";
		if(score >= 90 && score <=100) {
			grade = "A";
		}else if(score >= 80){
			grade = "B";
		} else if(score >= 70){
			grade = "C";
		} else if(score >= 60){
			grade = "D";
		} else {
			grade = "F";
		}
		out.print(grade); 
		%>
