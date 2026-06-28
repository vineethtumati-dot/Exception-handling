package exceptions;
import java.util.Scanner;

public class ArithmeticExceptionHandling   {
	static int result =0;
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	while(true) {

		System.out.println("enter the dividend");
	int dividend =sc.nextInt();
	
	System.out.println("enter the divisor");
	int divisor =sc.nextInt();
	
	try {
	result =dividend/divisor;
	System.out.println("quotient is "+result);
	
	}
	catch(ArithmeticException ref) {
		
		System.out.println("cannot divided by zero");
		}
	
	finally {
		System.out.println("calculation is completed");
	}
	System.out.println("do you want ot Exit  type(yes/no)");
	String choice =sc.next();
	
	if(choice.equalsIgnoreCase("no")) {
		System.out.println("-----end-----");
		break;
	}
	
		
	}
	
	
	}
	
	}
	
	


