package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/ss")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String userpass=request.getParameter("userpass");
		HttpSession session =request.getSession();
		//String lang[]=request.getParameterValues(username)
		if(username.equals("admin")&& userpass.equals("1234")) {
			//out.print("welocme admin");
			session.setAttribute("uname", username);//key-value
			RequestDispatcher rs=request.getRequestDispatcher("profile.jsp");
			rs.forward(request, response);
			//response.sendRedirect("https://www.google.com/");
		}
		else {
			out.print("invalid user");
			RequestDispatcher rs=request.getRequestDispatcher("login.html");
			rs.include(request, response);
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
