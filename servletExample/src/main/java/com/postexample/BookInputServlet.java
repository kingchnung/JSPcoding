package com.postexample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookInputServlet
 */
@WebServlet("/bookInput")
public class BookInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("title", request.getParameter("title"));
		request.setAttribute("author", request.getParameter("author"));
		request.setAttribute("publisher", request.getParameter("publisher"));
		
		RequestDispatcher dispatch = request.getRequestDispatcher("bookOutput");
		dispatch.forward(request, response);
	}
}
