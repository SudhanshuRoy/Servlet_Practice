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
 * Servlet implementation class servlet2
 */
@WebServlet(description = "To understand diff b/w parameter and attribute and request dispatcher", urlPatterns = {
		"/s2" })
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet2() {
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
		Integer n1 = Integer.parseInt(request.getParameter("n1") != null ? request.getParameter("n1") : "0");
		Integer n2 = Integer.parseInt(request.getParameter("n2") != null ? request.getParameter("n2") : "0");

		int s = n1 + n2;
		int sum = (Integer) request.getAttribute("sum");
		int product = n1 * n2;
		
		out.println("<h1>");
		out.println("sum is : "+sum);
		out.println("product is : "+product);
		out.println("</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
