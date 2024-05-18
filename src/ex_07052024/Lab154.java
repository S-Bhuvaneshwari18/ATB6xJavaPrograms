package ex_07052024;

import java.util.Scanner;

public class Lab154 {

	public static void main(String[] args) {
		// Purpose of function-- Piece of code can be reused
		/*
		 * Long code--divide the code into smaller chunks
		 * 
		 * Calculator
		 * -Sum Task -->sum function
		 * -Sub Task -->sub function
		 * -Mul Task -->mul function
		 */
     
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1= sc.nextInt();
		System.out.println("Enter num2");
		int num2= sc.nextInt();
		//Calculator
		
		int r1=sum(num1,num2);
		System.out.println("Sum is --> " +r1);
		
		int r4=sum(56,67);//reused
		System.out.println("Sum is --> " +r4);

		int r2=sub(num1,num2);
		System.out.println("Sub is --> " +r2);

		int r3=mul(num1,num2);
		System.out.println("Mul is --> " +r3);
	}
	static int sum( int a, int b ) { // Define
		 return a+b;
	}
	static int sub( int a, int b ) { // Define
		 return a-b;
	}
	static int mul( int a, int b ) { // Define
		 return a*b;
	}
	
}
