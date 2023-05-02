package sample;
import java.sql.*;
public class ClassExp {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/workout01","root","root");
//		PreparedStatement pt = con.prepareStatement("create database workout01");
//		PreparedStatement pt = con.prepareStatement("create table class(id integer primary key, name varchar(25), location varchar(20), phone Bigint)");
//		pt.execute();
//		PreparedStatement pt = con.prepareStatement("insert into class values(1005,'follow','belgum',917834590)");
		PreparedStatement pt = con.prepareStatement("update class set name ='    ' where id = 1005");
		pt.executeUpdate();
		System.out.println("done");
		
		
		
	}

}
