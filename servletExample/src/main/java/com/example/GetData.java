package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetData
 */
@WebServlet("/getData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();

		StringBuilder sb = new StringBuilder();
		String userName = request.getParameter("name");
		String userAddress = request.getParameter("address");
		sb.append("<h1 style='text-align : center;'>POST 방식 테스트입니다.</h1>" + "<ul>" + "<li>입력한 이름 : " + userName + "</li>" + "<li>입력한 주소 : "
				+ userAddress + "</li>" + "</ul>" + "<a href='#' onclick='history.back();'>이전 페이지</a>");

		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>POST DATA</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println(sb.toString());
		out.println("</body></html>");
		out.close();
//		process(request, response);
	}

//	protected void process(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		response.setContentType("text/html; charset=utf-8");
//		
//		PrintWriter out = response.getWriter();
//
//		StringBuilder sb = new StringBuilder();
//		String userName = request.getParameter("name");
//		String userAddress = request.getParameter("address");
//		sb.append("<h1>POST 방식 테스트입니다.</h1>" + "<ul>" + "<li>입력한 이름 : " + userName + "</li>" + "<li>입력한 주소 : "
//				+ userAddress + "</li>" + "</ul>" + "<a href='#' onclick='history.back();'>이전 페이지</a>");
//
//		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
//		out.println("<title>POST DATA</title>");
//		out.println("<link rel='icon' href='data:,'></head>");
//		out.println("<body>");
//		out.println(sb.toString());
//		out.println("</body></html>");
//		out.close();
//	}

}
