package perumal1;
import java.sql.*;

public class Sample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perumal1","root","root");
		Statement st = con.createStatement();
//		st.execute("create table tiger(id integer primary key, name varchar(20) not null, PhoneNumber integer)");
//		int a = st.executeUpdate("insert into tiger values(3,'Hemanth',143)");
//		int a = st.executeUpdate("update tiger set phoneNumber = 999 where id= 2");
//		int a = st.executeUpdate("delete from tiger where id = 3");
		ResultSet rs = st.executeQuery("select * from tiger");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		
//		System.out.println(a);
		con.close();
		
	}

}
