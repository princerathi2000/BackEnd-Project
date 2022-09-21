package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		String name=request.getParameter("name");
  		String pass=request.getParameter("pass");
		PrintWriter writer=response.getWriter();
  		
//  		if(name.equals("Ansul") && pass.equals("123"))
//  		{
  			writer.println("Welcome"+name);
//  		}
//  		else
//  		{
//  			writer.println("Check Id / Pass");  			
//  		}
  	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
