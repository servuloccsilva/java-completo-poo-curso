package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Client clnt = new Client();
		
		System.out.println("Enter account number");
		int accountNumber = sc.nextInt();
		clnt.setAccountNumber(accountNumber);
		
		System.out.println("Enter account holder");
		sc.nextLine();
		String name = sc.nextLine();
		clnt.setName(name);
		
		System.out.println("Is there an initial deposit (y/n)?");
		char deposit = sc.next().charAt(0);
		
		if(deposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			clnt.deposit(depositValue);			
		}
		else if (deposit == 'n'){
			System.out.println("\n");
		}
		
		System.out.println("Account data: " + "\n" + clnt);
		
		System.out.println("Enter a deposit value");
		double depositValue = sc.nextDouble();
		clnt.deposit(depositValue);
		
		System.out.println("Updated account data: " + clnt);
		
		System.out.println("Enter a withdraw value");
		double withdrawValue = sc.nextDouble();
		clnt.withdraw(withdrawValue);
		
		System.out.println("Updated account data: " + clnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
