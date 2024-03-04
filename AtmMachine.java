import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		
		int balance=20000,withdraw,deposite,num;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Welcome to ATM Macine");
			System.out.println("1.withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.check balance");
			System.out.println("4.Exit");
			
			num=sc.nextInt();
			
			switch(num) 
			{
			case 1:
				System.out.println("Enter amount to be withdraw");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("Balance amount is:"  + balance);
					System.out.println("please collect Money");
					
				}
				else
				{
					System.out.println("You dont have enough money");
				}
				System.out.println(" ");
			
				break;
			
			case 2:
					System.out.println("Enter amount to deposite");
					deposite=sc.nextInt();
					balance=balance+deposite;
					System.out.println("Balance amount is" +  balance);
					System.out.println("Money has been deposited successfully");
			
					System.out.println(" ");
					break;
			
			
			case 3:
					System.out.println("Your account balance is:"    + balance);
					System.out.println(" ");
					break;
			
			case 4:
				System.exit(0);
				System.out.println(" ");
	}

}

}
}