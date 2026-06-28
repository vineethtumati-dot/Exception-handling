package exceptions;

import java.util.Scanner;

public class ThrowException {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the age ");
		int age =sc.nextInt();
		
		
		if (age < 18) {
			throw new IllegalArgumentException("Not Eligible to vote");
		}
		
			System.out.println("Eligible to vote");

		
		System.out.println("Do you want to continue(yes/no");
		String choice=sc.next();
		if (choice.equalsIgnoreCase("no")) {
			System.out.println("-----End-----");
			break;
		}
		}
		sc.close();
	}
}