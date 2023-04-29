package com.sudhanshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(description = "To practice and understand difference between parameters and attributes and request dispatcher", urlPatterns = {
		"/s1" })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
		    String n1Param = request.getParameter("n1");
		    String n2Param = request.getParameter("n2");

		    int n1 = 0;
		    int n2 = 0;
		    if (n1Param != null && !n1Param.isEmpty() && n1Param.matches("\\d+")) {
		        n1 = Integer.parseInt(n1Param);
		    }
		    if (n2Param != null && !n2Param.isEmpty() && n2Param.matches("\\d+")) {
		        n2 = Integer.parseInt(n2Param);
		    }

		    int sum = n1 + n2;
		    request.setAttribute("sum", sum);
		    RequestDispatcher rd = request.getRequestDispatcher("s2");
		    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
