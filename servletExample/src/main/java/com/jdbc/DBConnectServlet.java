package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBConnectServlet
 */
@WebServlet("/connect")
public class DBConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>데이터베이스 연동</title>");
		out.println("<link rel='icon' href='data:,'>");
		out.println("</head><body>");
		out.println("<h3>데이터베이스 드라이버와 Oracle 서버 연결 점검 프로그램 </h3><hr />");
		
		try {
			String driverName = "oracle.jdbc.driver.OracleDriver";
			String dbURL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			
			Class.forName(driverName);
			
			try(Connection conn = DriverManager.getConnection(dbURL, "javauser", "java1234")){
				
				out.println("Oracle 서버에 성공적으로 접속했습니다.");
				out.println("</body></html>");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			out.print("접속에 실패하였습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			out.print("접속에 실패하였습니다.");
		}finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
