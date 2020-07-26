package Practice;

import java.util.Scanner;


public class BankApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double balance = 10000;
		boolean quit = false;
		
		do {
		System.out.println("---------- Welcome to Dangi's Bank------------");
		System.out.println();
		System.out.println("Select of Your Type of Account : ");
		System.out.println("1. Saving Account:");
		System.out.println("2. Current Account :");
		System.out.print("0 to quit: ");
		
		int choice;
		
		choice =scan.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("1. Saving Account :");
			System.out.println("Transaction Succussful :");
			System.out.println("Enter Your Choice :");
			System.out.println("1. Withdraw :");
			System.out.println("2. Deposit :");
			System.out.println("3. Check Balance :");
			
		
			int userChoice;
			double amount;
			userChoice =scan.nextInt();
			switch(userChoice) {
			case 1 :
				System.out.println("Amount to Withdraw  :");
				amount = scan.nextDouble();
				if (amount > 5000 )
                    System.out.println("Insufficeinet Balance");
               else {
                    balance -= amount;
                    System.out.println("Rs." + amount + " has been withdrawn.");
                }
				break;
			
			case 2 :
				System.out.println("Account to Deposit :");
				amount = scan.nextFloat();

                if (amount <= 0)
                     System.out.println("Can't deposit nonpositive amount.");
                else {
                     balance += amount;
                     System.out.println("Rs." + amount + " has been deposited.");
                }
                break;
				
			case 3 :
				System.out.println("Your balance: Rs." + balance);
				break;
			
				
			}
			break;
				
		
		
		
		case 2 :
			
			System.out.println("2. Current Account :");
			System.out.println("Transaction Succussful :");
			System.out.println("Enter Your Choice :");
			System.out.println("1. Withdraw :");
			System.out.println("2. Deposit :");
			System.out.println("3. Check Balance :");
			
			
			int userChoices;
			userChoices =scan.nextInt();
			switch(userChoices) {
			case 1 :
				System.out.println("Amount to Withdraw  :");
				amount = scan.nextDouble();
				if (amount <= balance || amount > balance)
                    System.out.println("Insufficeinet Balance");
               else {
                    balance -= amount;
                    System.out.println("Rs." + amount + " has been withdrawn.");
                }
				break;
			
			case 2 :
				System.out.println("Account to Deposit :");
				amount = scan.nextFloat();

                if (amount <= 0)
                     System.out.println("Can't deposit nonpositive amount.");
                else {
                     balance += amount;
                     System.out.println("Rs." + amount + " has been deposited.");
                }
                break;
				
			case 3 :
				System.out.println("Your balance: Rs." + balance);
				break;
				
				
			}
			break;

		
			
		case 0 :
			quit = true;		
			break;
		}
		
			
		}while(!quit);
		System.out.println("Thanks");
		
	}

}
