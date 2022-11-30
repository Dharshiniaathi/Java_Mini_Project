package atm_interface;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		float amount=5000;
		float withdrawAmount,depositAmount;
		int pinno;
		int choice;
		Scanner s=new Scanner(System.in);	
		
		while(true) {
			
			System.out.println("****WELCOME TO IDFC ATM****");
			System.out.println("Enter Pin Number");
			pinno=s.nextInt();
			if(pinno==1410) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice=s.nextInt();
			switch(choice) {
			
			// to deposit the amount
			case 1:
				
				System.out.println("Enter the amount to be deposit");
				depositAmount=s.nextFloat();
				amount=amount+depositAmount;
				System.out.println("Your money has been DEPOSITED SUCCESSFULLY");
				break;
				
				//to withdraw money
			case 2:
				
				System.out.println("Enter the amount to be withdraw");
				withdrawAmount=s.nextFloat();
				if(withdrawAmount>amount) {
					System.out.println("Insufficient Balance.....! can't withdraw");
					System.out.println("Available Balance: "+amount);
				}else {
				amount=amount-withdrawAmount;
				System.out.println("Please collect your cash");
				System.out.println("Available Balance: "+amount);
			    }
				break;
				
				//to display the balance
				
			case 3:
				
				System.out.println("Balance: "+amount);
				break;
				
			case 4:
				
				System.out.println("Exit....");
				break;
				
			default:
				
				System.out.println("Invalid Option");
				
			}
			}else {
				System.out.println("Please enter the valid Pin No");
			}
			
			// for repeat the process
			System.out.println("Do you want to continue (Y/N)");
			char option=s.next().charAt(0);
			if(option=='n' )
				break;
		}
		
		System.out.println("Thank you...");
	}

}
