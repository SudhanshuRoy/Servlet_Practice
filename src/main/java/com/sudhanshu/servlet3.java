package com.sudhanshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet3
 */
@WebServlet(description = "to practice cookies", urlPatterns = { "/s3" })
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         Cookie [] cookies=request.getCookies();
         PrintWriter out=response.getWriter();
         Boolean flag=true;
         if(cookies !=null) {
        	 for(Cookie c:cookies)
        	 {
        		 if(c.getName().equals("name")) {
        			 flag=flag;
        			 out.println("<h1>my name is : "+c.getValue()+"</h1>");
        			 break;
        		 }
        	 }
         }
         if(false) out.println("<h1>You are new user so go to hame page and login again</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
