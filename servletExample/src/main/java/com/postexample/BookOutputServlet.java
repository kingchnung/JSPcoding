package com.postexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.BookDTO;

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
		
		BookDTO book = (BookDTO) request.getAttribute("book");
		
		out.println("<!DOCTYPE html><html>");
	      out.println("<head><meta charset='UTF-8' />");
	      out.println("<title>dispatcher 예제</title>");
	      out.println("<link rel='icon' href='data:,'></head>");
	      out.println("<body>");
	      out.println("<h2>입력받은 책 정보</h2>");
	      out.println("<hr />");
	      out.println("<div> 책 제목 : " + book.getTitle() + "</div>");
	      out.println("<div> 책 저자 : " + book.getAuthor() + "</div>");
	      out.println("<div> 출판사  : " + book.getPublisher() + "</div>");
	      out.println("</body></html>");   
	      
	}

}
