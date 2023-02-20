package entites;

import java.util.Locale;
import java.util.Scanner;

import banking.Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank client;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there a initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y') {
			System.out.println("Enter a initial deposit value: ");
			double deposit = sc.nextDouble();
			client = new Bank(accountNumber,name,deposit);
		} else {
			client = new Bank(accountNumber, name);
		}
		
		System.out.println("Acoount data:");
		System.out.println(client);
		
		System.out.print("Enter a deposit value");
		double depositValue = sc.nextDouble();
		client.cashDeposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value");
		depositValue = sc.nextDouble();
		client.withdrawMoney(depositValue);
		System.out.println("Update account data:");
		System.out.println(client);
			
		sc.close();
	}
}
