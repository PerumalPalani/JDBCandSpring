package database01;
import java.sql.*;

public class Dynamic {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database01","root","root");
		PreparedStatement  pt = con.prepareStatement("create table Details(Name varchar(25) primary key, Id integer not null, Gender varchar(10) not null,Phone integer not null, Address varchar(20) not null)");
		pt.executeUpdate();
		con.close();
	}

}
