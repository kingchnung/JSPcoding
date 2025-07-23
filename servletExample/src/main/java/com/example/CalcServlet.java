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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		String num1 = request.getParameter("num1");
		String op = request.getParameter("operator");
		String num2 = request.getParameter("num2");
		double result = calc(num1, op, num2);

		boolean num1HasDot = num1.contains(".");
		boolean num2HasDot = num2.contains(".");

		String value;
		if (num1HasDot || num2HasDot) {
			value = num1 + " " + op + " " + num2 + " = " + result;
		} else {
			value = num1 + " " + op + " " + num2 + " = " + (int) result;
		}
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>간단한 계산기</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<h2>계산결과</h2><hr />" + value);

		out.println("</body></html>");
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected double calc(String a, String b, String c) {
		double result = 0;
		double num1 = Double.parseDouble(a);
		double num2 = Double.parseDouble(b);

		switch (c) {
		case "+" -> result = num1 + num2;
		case "-" -> result = num1 - num2;
		case "*" -> result = num1 * num2;
		case "/" -> {
			if (num2 != 0)
				result = (num1 / num2);
			else
				result = 0;
		}
		}

		return result;
	}

}
