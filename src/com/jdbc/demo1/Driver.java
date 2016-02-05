package com.jdbc.demo1;
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			//1.get a connection
			Class.forName("com.mysql.jdbc.Driver");// Legacy code for jdbc 3.0 
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skycreations","root", "");
			//2.create a statement
			Statement myStmt = myConn.createStatement();
			//3.execute sql query
			ResultSet myRs = myStmt.executeQuery("select * from anshika");
			//4.process result
			while(myRs.next()){
				System.out.println(myRs.getString("message") + " " + myRs.getString("name"));
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
