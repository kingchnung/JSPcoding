package com.forward.dispatcher;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet3
 */
@WebServlet("/firstDispatcher")
public class FirstServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=utf-8");
		
//		RequestDispatcher dispatch = request.getRequestDispatcher("secondDispatcher?language=java");
//		dispatch.forward(request, response);
		
		//바인딩
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		String now = dateFormat.format(date);
		
		request.setAttribute("language", "java");
		request.setAttribute("name", "홍길동");
		request.setAttribute("address", "서울특별시 강남구 테헤란로14길 6");
		request.setAttribute("age",  20);
		request.setAttribute("date", now);
		RequestDispatcher dispatch = request.getRequestDispatcher("secondDispatcher");
		dispatch.forward(request, response);
	}

}
