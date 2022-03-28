import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BankAccount ob=new BankAccount("Enterprises","e12345");
		ob.showMenu();
	}

}
class BankAccount{
	int balance;
	int previousTransaction;
	String  customerName;
	String customerId;
	
	 BankAccount(String cname, String cid) {
		customerName= cname;
		customerId= cid;
	}
	 
	void deposit(int amount) {
		if(amount !=0) {
			balance=balance + amount;
			previousTransaction= amount;
		}
	}
	void withdraw(int amount) {
		if(amount !=0) {
			balance= balance - amount;
			previousTransaction= -amount;
		}
	}
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
		 System.out.println("Deposited:" + previousTransaction);
   }
		else if(previousTransaction < 0) {
			System.out.println("Withdraw: " +Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transaction occur");
		}
	}
	
	
	void showMenu() {
		char option= '\0';
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome:" +customerName);
		System.out.println("Your ID:" + customerId);
		System.out.println("\n");
		
		System.out.println("A : Check your Balance");
		System.out.println("B : Deposit balance ");
		System.out.println("C : Withdraw");
		System.out.println("D : previousTransaction");
		System.out.println("E : Exit");
		
	do {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Enter your Option");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		option=sc.next().charAt(0);
		System.out.println("\n");
		
		switch(option) {
		
		case 'A':
			System.out.println("-----------------------------------------------------------");
			System.out.println("Balance = "+balance);
			System.out.println("-----------------------------------------------------------");
			System.out.println("\n");
			break;
			
			
		case 'B':
			System.out.println("-----------------------------------------------------------");
			System.out.println("Enter an amount to deposit");
			System.out.println("-----------------------------------------------------------");
			
			int amount =sc.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("-----------------------------------------------------------");
			System.out.println("Enter an amount to withdraw");
			System.out.println("-----------------------------------------------------------");
			
			int amount2 =sc.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
			
			
		case 'D':
			System.out.println("-----------------------------------------------------------------");
			getPreviousTransaction();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n");
			break;
			
		case'E':
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			break;
			
			
			default:
				System.out.println("Invalid option! Please enter Correct Option");
				break;
		}
		
	}	
		while(option !='E');
		System.out.println("Thank You for Using our Services.....!!");
		}
	
		
	}