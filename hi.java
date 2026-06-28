package exceptions;

import java.util.Scanner;

public class hi{

static void checkAge(int age)throws IllegalArgumentException{
	
	if(age<18) {
		throw new IllegalArgumentException("Not Eligible ") ;
	}
	System.out.println("Eligible");
	
	
}


static void checkName(String name)throws  IllegalArgumentException{
	
	if (name!="vineeth") {
		throw new  IllegalArgumentException("not matched");
	}
	System.out.println("ok");
}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
		
			System.out.println("enter the age");
		int age =sc.nextInt();
		
		checkAge(age);
		
		
		System.out.println("continue ? (yes/no)");
		String choice =sc.next();
		
		System.out.println("enter the name");
		String name =sc.next();
		
		
		if(choice.equalsIgnoreCase("no")) {
		System.out.println("----end----");
		break;
	}
		
		
		
		}
	}
}


