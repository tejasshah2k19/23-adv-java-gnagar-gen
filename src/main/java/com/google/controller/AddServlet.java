package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("AddServlet Called...");

		String n1 = request.getParameter("n1");// ""
		String n2 = request.getParameter("n2");

		System.out.println("n1 => " + n1);
		System.out.println("n2 => " + n2);

		boolean isError = false;// no error
		String error = ""; 
		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter N1<br>";
		}

		if (n2 == null || n2.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter N2<br>";
			
		}

		if (isError == false) {
			// how to convet string into int
			// Integer.parseInt(str);

			int no1 = Integer.parseInt(n1);// ""
			int no2 = Integer.parseInt(n2);
			int ans = no1 + no2;
			System.out.println(no1 + no2);

			// audio video pdf xls image html text
			response.setContentType("text/html");// MIME TYPE
			// text/txt
			// appliaction/xls
			// /pdf
			// image/png gif jpeg
			// video/mp4 /3gp
			// audio/mp3
			PrintWriter out = response.getWriter(); // IO

			out.print("<html><body>");
			out.print("No.1 : " + no1);
			out.print("<br>No.2 : " + no2);
			out.print("<br>Ans : " + ans);
			out.print("</body></html>");
		} else {
			response.setContentType("text/html");// MIME TYPE
			PrintWriter out = response.getWriter(); // IO
			out.print("<html><body>");
			out.print("<font color=red>"+error+"</font>");
			
			out.print("</body></html>");

		}
	}

}
