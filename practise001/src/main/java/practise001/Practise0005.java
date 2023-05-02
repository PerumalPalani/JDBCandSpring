package practise001;
import java.sql.*;

public class Practise0005 {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		 PreparedStatement pt= con.prepareStatement("create database School002");
		//PreparedStatement p = con.prepareStatement("create table student_info(id number(10) primery key, name varchar2(25),standard number(2), section char(),percentage number(3))");
		System.out.println("done");
		
	}

}
