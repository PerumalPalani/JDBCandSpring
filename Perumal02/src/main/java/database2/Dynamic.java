package database2;
import java.sql.*;

public class Dynamic {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perumal1","root","root");
		PreparedStatement pt = con.prepareStatement("create table user(Name varchar(20) primary key, id integer not null, Gender varchar(20) not null, phone integer not null, address varchar(20) not null)");
		int a = pt.executeUpdate("insert into user values('Richard', 3002, 'Male', 8593535, 'Andrapradesh')");
		pt.execute();
		con.close();
		System.out.println(a);
		
	}

}
