package exceptions;
import java.util.Scanner;


public class ArrayindexOutOfBoundsException{

static void arrayexception(int []arr,int index) {
	try {
		System.out.println("element at index "+index+" is:"+arr[index]);

	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index.!");
		System.out.println("array size is "+arr.length);
		
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			
		
		System.out.println("enter the size of an array");
		int size =sc.nextInt();
		
		int []arr=new int [size];
		
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
	  arr[i] =sc.nextInt();
		}
	
	  
	  for(int i=0;i<arr.length;i++) {
		  
		  System.out.print(arr[i]+" ");
	  }
	 
	  
	  System.out.println("enter the index");
	  int index=sc.nextInt();
	  
	  
	  
	  arrayexception(arr,index);
	  
	  System.out.println("do you want to continue(yes/no)");
	  String choice =sc.next();
	  if(choice.equalsIgnoreCase("no")) {
			System.out.println("-----end-----");
			break;
		}
		
		}
	}
	}	
	


	
	

