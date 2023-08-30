package com.jspiders.student_info.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String PreparedStatement = null;
	
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private static int result;
	private static ResultSet resultSet;
	private static Properties properties= new Properties();
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
			if(PreparedStatement != null) {
				preparedStatement.close();
			}
			if(resultSet != null) {
				resultSet.close();
			}
			if(file != null) {
				file.close();
			}
			if(result != 0) {
				result =0;
			}
			if(statement != null) {
				statement.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			int Id =  Integer.parseInt(req.getParameter("ID"));
			String na = req.getParameter("name");
			String em = req.getParameter("email");
			int age = Integer.parseInt(req.getParameter("age"));
			String add = req.getParameter("address");
			resp.setContentType("text/html");
			PrintWriter w = resp.getWriter();
			
		

		try {
			openConnection();
			statement=connection.createStatement();
			query="create table Registration(sid int(5) primary key,Student_name varchar(50),Student_email varchar(20),Student_age int(10),Student_address varchar(50))";
			result=statement.executeUpdate(query);
			if(result==1) {
				w.println("<h1>database is already present</h1>");
			}
		} catch (Exception e) {
			
		}finally {
			closeConnection();
			
		}
		
		
		
		
		try {
			
			openConnection();
			query="insert into Registration values(?,?,?,?,?)";
			
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,Id);
			preparedStatement.setString(2, na);
			preparedStatement.setString(3, em);
			preparedStatement.setInt(4, age);
			preparedStatement.setString(5, add);
			
			result=preparedStatement.executeUpdate();
			
			
			w.println("<h1><a href=stu_info.html>Data is inserted </a></h1>");
		} catch (Exception e) {
			w.println("<a href=stu_info.html>data is already exist try again</a>");
		}finally {
			closeConnection();
		}
		
		
		
		
		
		
		
	}

}
