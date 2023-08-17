package example;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter password");
		int password=scan.nextInt();
		if(password==123) {
			System.out.println("login succssful");
		}
		else {
			try {
				throw new InvalidPasswordException("kindly enter valid password");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
