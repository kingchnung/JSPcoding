package com.postexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookOutputServlet
 */
@WebServlet("/bookOutput")
public class BookOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		 PrintWriter out = response.getWriter();
		
		String title = (String)request.getAttribute("title");
		String author = (String)request.getAttribute("author");
		String publisher = (String)request.getAttribute("publisher");
		
		out.println("<!DOCTYPE html><html>");
	      out.println("<head><meta charset='UTF-8' />");
	      out.println("<title>dispatcher 예제</title>");
	      out.println("<link rel='icon' href='data:,'></head>");
	      out.println("<body>");
	      out.println("<h2>입력받은 책 정보</h2>");
	      out.println("<hr />");
	      out.println("<div> 책 제목 : " + title + "</div>");
	      out.println("<div> 책 저자 : " + author + "</div>");
	      out.println("<div> 출판사  : " + publisher + "</div>");
	      
	      out.println("</body></html>");   
	}

}
