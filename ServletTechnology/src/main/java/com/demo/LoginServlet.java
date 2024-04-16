package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logins")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String userpass=request.getParameter("userpass");
		if(username.equals("admin")&& userpass.equals("1234")) {
			out.print("welcome admin");
//			RequestDispatcher rs=request.getRequestDispatcher("register.html");
//			rs.include(request, response);
			response.sendRedirect("https://www.google.com/");
		}
		else {
			out.print("invalid user");
			RequestDispatcher rs=request.getRequestDispatcher("Login.html");
			rs.include(request, response);
		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
