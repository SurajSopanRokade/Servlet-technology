package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpRegServlet
 */
@WebServlet("/empreg")
public class EmpRegServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String empname=request.getParameter("empname");
		String salary=request.getParameter("salary");
		String lang[]=request.getParameterValues("lang");
		String gender=request.getParameter("gender");
		out.print("<p>name : "+empname+" salary : "+salary+" lang : "+Arrays.toString(lang)+" Gender : "+gender);
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
