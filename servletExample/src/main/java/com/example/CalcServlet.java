package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("num1"));
		String operator = request.getParameter("operator");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>간단한 계산기</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<h2>계산결과</h2><hr />"
				+ num1 + " " + operator + " " + num2 + " = " + calc(num1, operator,num2));
		
		out.println("</body></html>");
		out.close();
	}
	
	protected int calc(int a, String c, int b) {
		int result = 0;
		
		switch(c) {
		case "+" -> result = a + b;
		case "-" -> result = a - b;
		case "*" -> result = a * b;
		case "/" -> result = (a / b);
		}

		
		return result;
	}

}
