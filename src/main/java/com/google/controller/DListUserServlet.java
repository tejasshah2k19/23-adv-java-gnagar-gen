package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DListUserServlet")
public class DListUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// db connection

		// prepared

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
				PreparedStatement pstmt = con.prepareStatement("select * from users");

				ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {// first record

					String firstName = rs.getString("firstName");
					String email = rs.getString("email");

					System.out.println(firstName + "  " + email);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// ctrl+space
}
