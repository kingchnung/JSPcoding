package com.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subject.SubjectDAO;
import com.subject.SubjectVO;

/**
 * Servlet implementation class SubjectServlet
 */
@WebServlet("/list")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SubjectDAO dao = SubjectDAO.getInstance();
		List<SubjectVO> list = dao.getAllSubjects();
		
		request.setAttribute("list", list);
		RequestDispatcher dispatch = request.getRequestDispatcher("subject/subjectList.jsp");
		dispatch.forward(request, response);
	}
}
