package college_form;

import java.sql.*;
import java.util.Scanner;

public class CollegeForm {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		// PreparedStatement pt= con.prepareStatement("create database
		// College");
		// PreparedStatement pt = con.prepareStatement("create table EWIT(Name
		// varchar(25) not null, USN varchar(25) primary key, PhoneNumber bigint
		// unique, city varchar(25) not null, CGPA double not null)");
		// pt.execute();
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("******EWIT*********");
			System.out.println("East West Insitute of technology");
			System.out.println("1. Add Student");
			System.out.println("2.Fetch the student by using USN");
			System.out.println("3. Resticate the student");
			System.out.println("4. Fetch all the student detatils");
			System.out.println("5. Modify the phone number by using USN");
			System.out.println("6. Exist");
			switch (s.nextInt()) {
			case 1: {
				System.out.println("Enter the Name:");
				String name = s.next();
				System.out.println("Enter the USN:");
				String usn = s.next();
				System.out.println("Enter the Phone number:");
				long phone = s.nextLong();
				System.out.println("Enter the City:");
				String city = s.next();
				System.out.println("Enter the Overall CGPA");
				double cgpa = s.nextDouble();
				PreparedStatement pt = con.prepareStatement("Insert into ewit values(?,?,?,?,?)");
				pt.setString(1, name);
				pt.setString(2, usn);
				pt.setLong(3, phone);
				pt.setString(4, city);
				pt.setDouble(5, cgpa);
				pt.executeUpdate();
				System.out.println("one row added successfully!");
				System.out.println("*********************************");
			}
				break;
			case 2: {
				System.out.println("Enter the Usn number");
				String usn = s.next();
				PreparedStatement pt = con.prepareStatement("select * from ewit where usn = ?");
				pt.setString(1, usn);
				ResultSet rs = pt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getLong(3) + " "
							+ rs.getString(4) + " " + rs.getDouble(5));
				}
				System.out.println("****Details displayed****");

			}
				break;
			case 3: {
				System.out.println("Enter the USN:");
				String usn = s.next();
				PreparedStatement pt = con.prepareStatement("delete from ewit where usn = ?");
				pt.setString(1, usn);
				pt.executeUpdate();
				System.out.println("Successfully Deleted!");
			}
				break;
			case 4: {
				PreparedStatement pt = con.prepareStatement("select * from ewit");
				ResultSet rs = pt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getLong(3) + " "
							+ rs.getString(4) + " " + rs.getDouble(5));
				}
				System.out.println("Successfully displayed!");
			}
				break;
			case 5: {
				System.out.println("Enter the USN:");
				String usn = s.next();
				System.out.println("Enter the New Phone number:");
				long phone = s.nextLong();
				PreparedStatement pt = con.prepareStatement("update ewit set PhoneNumber = ? where USN = ?");
				pt.setLong(1, phone);
				pt.setString(2, usn);
				pt.executeUpdate();
				System.out.println("Successfully updated");
			}
				break;
			case 6: {
				System.out.println("Thank you!");
				flag = false;
				con.close();
			}break;
			default :
				System.out.println("Invalid option");
				break;

			}
		}
	}

}
