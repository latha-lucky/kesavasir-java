package example;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int balance=5000;
		System.out.println("enter amount to be withdarwn");
		int amount=scan.nextInt();
		scan.close();
		if(amount<=balance) {
			System.out.println("amount withdrwan successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("insufficient funds");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
