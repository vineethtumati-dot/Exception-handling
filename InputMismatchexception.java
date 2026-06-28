package exceptions;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchexception{
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			
		try {
		System.out.println("enter the interger");
		BigInteger number=sc.nextBigInteger();
		
		System.out.println("integer = "+number);
		}
		catch (InputMismatchException e) {
			System.out.println("DataType is Missmatch");
		}
		
		System.out.println("do you want to continue (yes/no)");
		String choice =sc.next();
		
		if(choice.equalsIgnoreCase("no") ){
			System.out.println("-----end-----");
			break;
			
		}
		}
		
		sc.close();
	}
}


