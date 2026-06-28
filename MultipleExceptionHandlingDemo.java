package exceptions;

import java.util.Scanner;

public class MultipleExceptionHandlingDemo {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println("Enter divindor");
		int divindor = sc.nextInt();
		
		System.out.println("Enter divisor");
		int divisor=sc.nextInt();
		
	
		System.out.println("Enter size of an array");
		int size =sc.nextInt();	
		int []arr=new int[size];
		
		System.out.println("Enter elements inn array");
		for(int i=0;i<arr.length;i++) {
		arr[i] =sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println("   ");
		System.out.println("Enter the index ");
		int index =sc.nextInt();
		
		
		try{
			int result =divindor/divisor;
		System.out.println("Result ="+result);
			
		System.out.println(index+"index value = "+arr[index]);
		}
		
		catch(ArithmeticException e) {
		System.out.println("not divisible by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
			System.out.println("array size = "+arr.length);
		}
		
		finally {
			System.out.println("program operation completed");
		}
		
System.out.println("Do you want to continue(yes/no)");
String choices=sc.next();

if(choices.equalsIgnoreCase("no")) {
	System.out.println("-----Ended-----");
	break;
}
	}
		sc.close();
}
}