package com.jdbc.insertquery;

import java.sql.*;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbconnection = "jdbc:mysql://localhost:3306/skycreations";
		String username = "root";
		String password = "";
		try{
			//1.get a connection
			Class.forName("com.mysql.jdbc.Driver");// Legacy code for jdbc 3.0 
			Connection myConn = DriverManager.getConnection(dbconnection,username,password);
			//2.create a statement
			Statement myStmt = myConn.createStatement();
			//3.execute sql query
			String sql = "insert into anshika "
						+ " (id,name,message)"
						+ "values('4','vipul','hello')";
			myStmt.executeUpdate(sql);
			System.out.println("Values Inserted");
			//4.process result
			System.out.println("\n");
			ResultSet myRs = myStmt.executeQuery("select * from anshika");
			while(myRs.next()){
				System.out.println(myRs.getString("message") + " " + myRs.getString("name"));
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
