package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleDemo
 */
@WebServlet("/lcd")
public class LifeCycleDemo extends HttpServlet {
	
    public LifeCycleDemo() {
        System.out.println("inside constructor");
    }
    public void init(ServletConfig config)throws ServletException{
    	System.out.println("inside init method");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Hello i am in servlet");
		System.out.println("inside service");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	public void destroy() {
		System.out.println("inside destroy");
	}

}
