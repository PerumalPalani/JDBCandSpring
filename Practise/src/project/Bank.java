package project;

import java.util.Scanner;

class BankServer {
	String name;
	String password;
	long number;
	double amount = 10000;
	void signup(String un, String pwd, long phone) {
		name = un;
		password = pwd;
		number = phone;
		System.out.println("Signed Succesfully");
	}
	void login(String un, String pwd) {
		if((name.equals(un))&&(password.equals(pwd))) {
			System.out.println("succeffully login");
		}
		else{
			System.out.println("invalid user name and password "+name+" "+password);
		}
		}
	void checkbalance() {
		System.out.println("Available balnce is" + amount);
	}

	void withdraw(double amt) {
		if (amt < amount) {
			amount = amount - amt;
			System.out.println("Withdraw succesfully" + amt);
		} else {
			System.out.println("Insufficient balances");
		}
	}

	void logout() {
		System.out.println("Thank you for using!");
	}
}
public class Bank{	
	static BankServer b = new BankServer();
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while(flag == true) {
		System.out.println("1.Signup");
		System.out.println("2.Login");
		System.out.println("3.Check Balance");
		System.out.println("4.Withdraw");
		System.out.println("5.logout");
		System.out.println("Choose one option");
		int opt = s.nextInt();
		switch(opt){
		case 1:{
			System.out.println("Enter the user name");
			String un = s.next();			
			System.out.println("Enter the password");
			String pwd = s.next();
			System.out.println("Enter the phone number");
			long phone = s.nextLong();
			b.signup(un, pwd, phone);			
		}break;
		case 2:
		{	
			System.out.println("Enter the user name");
			String na = s.next();			
			System.out.println("Enter the password");
			String pass = s.next();
			b.login(na, pass);
		}break;
		case 3:
		{
			b.checkbalance();
		}break;
		case 4:
		{
			System.out.println("Enter the amount");
			double amt = s.nextDouble();
			b.withdraw(amt);
		}break;
		case 5:
		{
			b.logout();
			flag = false;
		}
			
		}
		}
		
		
	}
}
