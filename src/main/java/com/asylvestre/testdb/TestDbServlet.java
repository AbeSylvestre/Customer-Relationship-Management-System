package com.asylvestre.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Setup connection credentials
		String user = "asylvestre";
		String password = "asylvestre";

		String jdbcUrl = "jdbc:mysql://localhost:3306/customer-relationship-management-system?useSSL=false&serverTimezone=UTC";
		String driverClass = "com.mysql.cj.jdbc.Driver";

		// Get connection to Db!
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + jdbcUrl);

			Class.forName(driverClass);
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			out.println("Connected to the db");

		} catch (Exception ex) {
			ex.printStackTrace();
			throw new ServletException(ex);
		}

	}

}
