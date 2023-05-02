package assignment01;

import java.sql.*;
import java.util.Scanner;

public class Movie {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Movie", "root", "root");
		// PreparedStatement pt = con.prepareStatement("create database Movie");
		// PreparedStatement pt = con.prepareStatement("create table LuckyMan(Days integer primary key, Collection double not null)");
		boolean falg = true;
		while (falg) {
			System.out.println("1. Continue \n2.Exit");
			switch (s.nextInt()) {
			case 1:
				System.out.println("Choose flim\n1.KGF\n2.KANTHARA\n3.LUCKYMAN");
				switch (s.nextInt()) {
				case 1:
					System.out.println("Enter the KGF number of day");
					int kgfDay = s.nextInt();
					System.out.println("Enter the Collection amount");
					double kgfColl = s.nextDouble();
					PreparedStatement pt = con.prepareStatement("insert into kgf values(?,?)");
					pt.setInt(1, kgfDay);
					pt.setDouble(2, kgfColl);
					System.out.println("Data updated");
					pt.execute();
					break;
				case 2:
					System.out.println("Enter the KANTHARA number of day");
					int kantharaDay = s.nextInt();
					System.out.println("Enter the collection amount");
					double kantharaColl = s.nextDouble();
					PreparedStatement pt1 = con.prepareStatement("insert into kanthara values(?,?)");
					pt1.setInt(1, kantharaDay);
					pt1.setDouble(2, kantharaColl);
					System.out.println("Data updated");
					pt1.execute();
					break;
				case 3:
					System.out.println("Enter the LUCKYMAN number of day");
					int luckymanDay = s.nextInt();
					System.out.println("Enter the collection amount");
					double luckymanColl = s.nextDouble();
					PreparedStatement pt2 = con.prepareStatement("insert into luckyman values(?,?)");
					pt2.setInt(1, luckymanDay);
					pt2.setDouble(2, luckymanColl);
					System.out.println("Data updated");
					pt2.execute();
					break;
				default:
					System.out.println("Invalid option, Try again!");
					break;
				}
				break;
			case 2:
				System.out.println("Thank you for using!");
				falg = false;
				break;
			default:
				System.out.println("Invalid option, Try Once again!");
				break;
			}
		}
		con.close();
		// System.out.println("Data updated");
	}

}
