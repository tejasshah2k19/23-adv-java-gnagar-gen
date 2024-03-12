package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.util.Validator;

@WebServlet("/DSignupServlet")
public class DSignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation
		if (Validator.isBlank(firstName)) {

		} else if (Validator.isAlpha(firstName) == false) {
			// isError = true
		}

		// db save
		// db connection open
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24advgnr";
		String dbUserName = "root";
		String dbPassword = "root";

		try {
			// db connection logic

			// load your driver in memory
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);

			if (con != null) {
				System.out.println("Db Connected....");

				// execute query
				PreparedStatement pstmt = con
						.prepareStatement("insert into users (firstName,lastName,email,password) values (?,?,?,?)");
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				pstmt.setString(3, email);
				pstmt.setString(4, password);

				pstmt.executeUpdate();// run query
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("DSignup.jsp");
	}
}
