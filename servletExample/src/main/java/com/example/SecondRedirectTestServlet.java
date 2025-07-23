package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondRedirectTestServlet
 */
@WebServlet("/portalSite")
public class SecondRedirectTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String param = request.getParameter("site");
		
		switch(param) {
		case "naver" -> response.sendRedirect("https://www.naver.com/");
		case "daum" -> response.sendRedirect("https://www.daum.net/");
		case "w3school" -> response.sendRedirect("https://www.w3school.com/");
		case "google" -> response.sendRedirect("https://www.google.com/");
		}
	}

}
