package ex_27042024;

import java.util.Scanner;

public class Lab097 {

	public static void main(String[] args) {
		// Leap year Program 
		
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter  year");
	     int year =sc.nextInt();
	     
	     if ((year%4 ==0  && year%100 != 0)||(year%400==0)){
	    	 System.out.println("Leap year");
	     }else {
	    	 System.out.println(" Not a Leap year");
	     }
	    	 
	     

	}

}
