package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet2
 */
@WebServlet(
		name = "firstServlet2", 
		urlPatterns = { 
				"/first2", 
				"/first3"
		})
public class FirstServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>"
				+ "<html lang='ko'>"
				+ "<head>"
				+ "<meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'>"
				+ "<title>get 방식과 post 방식 데이터 확인 - query.html</title>"
				+ "<body>"
				+ "<h1>Hello Servlet ~~!</h1>"
				+ "</body>"
				+ "</html>");
		
		PrintWriter out = response.getWriter();
		
		out.println("============> doGet() 메서드 호출");
		out.println(sb.toString());
		
		out.close();
		
	}

}
