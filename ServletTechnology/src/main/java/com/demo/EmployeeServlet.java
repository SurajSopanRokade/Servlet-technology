package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
	PrintWriter out; 
	HttpSession session;
	
    public EmployeeServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		response.setContentType("text/html");
		session=request.getSession();
		List<Employee>elist = new ArrayList<>();
		elist.add(new Employee(10, "Suraj", 45000));
		elist.add(new Employee(11, "Sudarshan", 55000));
		elist.add(new Employee(12, "Yogesh", 56000));
		session.setAttribute("elist", elist);
		System.out.println("Session id : "+session.getId());
		response.sendRedirect("ShowEmployee.jsp");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
