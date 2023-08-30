package com.jspiders.student_info.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static Properties properties = new Properties();
	private static FileInputStream file;
	private static String filePath="E:\\WEJA2\\student_info\\Resources\\reg_info.properties";
	private static String query;
	
	private static void openConnection() {
		try {
			file=new FileInputStream(filePath);
			properties.load(file);
			Class.forName(properties.getProperty("driverPath"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	
	private static void closeConnection() {
		try {
			if(connection != null) {
				connection.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(resultSet != null) {
				resultSet.close();
			}
			if(file != null) {
				file.close();
			}
			if(resultSet != null) {
				resultSet.close();
			}
		} catch (Exception e) {
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String na = req.getParameter("user");
		String pass = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		String root="root";
		
		
		
		if (na.equals(root) && pass.equals(root))
 {
			try {
				openConnection();
				query="select * from registration";
				preparedStatement=connection.prepareStatement(query);
				
				resultSet=preparedStatement.executeQuery();
				w.println("<div align=center>");
				w.println("<table border=1px solid black>");
				w.println("<tr>");
				w.println("<th>ID</th>");
				w.println("<th>Stu_Name</th>");
				w.println("<th>Stu_email</th>");
				w.println("<th>Stu_age</th>");
				w.println("<th>Stu_address</th>");
				w.println("</tr>");
				while(resultSet.next()) {
					w.println("<tr>");
					w.println("<td>"+ resultSet.getInt(1)+"</td>");
					w.println("<td>"+ resultSet.getString(2)+"</td>");
					w.println("<td>"+ resultSet.getString(3)+"</td>");
					w.println("<td>"+ resultSet.getInt(4)+"</td>");
					w.println("<td>"+ resultSet.getString(5)+"</td>");
					w.println("</tr>");
				}
				w.println("</table>");
				w.println("<button><a href=stu_info.html>Go back</a></button>");
				w.println("</div>");
				
			} catch (Exception e) {
				w.println("<h1> something wrong with query</h1>");
			}finally {
				closeConnection();
			}
			
		}
		else {
			w.println("<h1><a href=stu_info.html>wrong email or password pls try again</a> </h1>");
		}
		
		
	
	}

}
