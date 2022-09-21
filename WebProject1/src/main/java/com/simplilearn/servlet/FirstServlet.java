package com.simplilearn.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends GenericServlet{
	private static final long serialVersionUID = 1L;
    private int counter;
    public FirstServlet() {
        System.out.println("Constructor");
        
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Method");
		counter=0;
	}

	public void destroy() {
		System.out.println("Destroy Method");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method");
		counter++;
		System.out.println("Your visitors are : "+counter);
	}

}
