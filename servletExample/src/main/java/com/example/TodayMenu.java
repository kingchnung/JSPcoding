package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayMenu
 */
@WebServlet("/todayMenu")
public class TodayMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>POST DATA</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<div style='text-align:center;'>오늘점심메뉴: <strong>");
		
		String[] values = request.getParameterValues("lunch");
		for(int i = 0; i < values.length; i++) {
			out.print(values[i]);
			if(i < values.length - 1) out.print(", ");
		}
		
		out.println("</strong></div></body></html>");
		out.close();
	}

}
