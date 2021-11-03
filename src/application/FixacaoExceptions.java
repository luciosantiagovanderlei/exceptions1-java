package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class FixacaoExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial Balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Whitdraw limit: ");
		Double whithdrawLimit = sc.nextDouble();
				
		Account account = new Account(number, holder, balance, whithdrawLimit);
		
		System.out.println(account);
		
		System.out.println();
		System.out.println();
	try {
		System.out.print("Enter amount for withdraw: ");
		account.withDraw(sc.nextDouble());		
		System.out.print("New balance: " + account.getBalance());
		} 
	catch (DomainException e) {
		
		System.out.println(e.getMessage());
	}	
		
		
		
		
		
		
		
		
		sc.close();

	}

}
