package sunday02;
import java.sql.*;
public class Dynamic {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails1","root","root");
		Statement st = con.createStatement();
//		st.execute("create database UserDetails1");
//		PreparedStatement st = con.prepareStatement("create table Honest1(Name varchar(25) primary key,Id integer not null,Gender varchar(1) not null,Phone Bigint not null,Address varchar(25) not null)");
//		PreparedStatement st = con.prepareStatement("insert into honest1 values('wonderla',1005,'F',0807218292,'Odisha')");
//		PreparedStatement st = con.prepareStatement("update honest1 set Name = 'Archana' where Id=1003");
//		PreparedStatement st = con.prepareStatement("delete from honest1 where id = 1005");
		ResultSet rs = st.executeQuery("select * from honest1");
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5));
		}
//		st.execute();
		con.close();
		System.out.println("data updated");
		
	}

}
