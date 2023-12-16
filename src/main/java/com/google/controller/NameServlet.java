package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException  {
		
		String userName = request.getParameter("userName"); 
		//validation 
		
		
		//process
		userName = userName.toUpperCase(); 
		
		
		//response 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("UserName => "+userName);
		out.print("</body></html>");
		
	}
}
