package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		System.out.println("============> HelloServlet 객체 생성");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("=============> init() 메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("==========> doGet() 메서드 호출");
		
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<! DOCTYPE html><html>");
		out.print("<head><meta charset='UTF-8'>");
		out.print("<title>JSP 예제</title>");
		out.print("<link rel='icon' href='data:,'></head>");
		out.print("<body><h1>Hello Servlet ~~!</h1></body>");
		out.print("</html>");
		
		out.close();
		
	}

}
