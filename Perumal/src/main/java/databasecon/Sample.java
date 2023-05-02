package databasecon;
import java.sql.*;

public class Sample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement st = con.createStatement();
		st.execute("create database perumal1");
		System.out.println("connection is done!");
		con.close();
		
	}

}
