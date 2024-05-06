package ex_27042024;

import java.util.Scanner;

public class Lab095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter your number1");
	     int num1=sc.nextInt();
	     System.out.println("Enter your number2");
	     int num2=sc.nextInt();
	     System.out.println("Enter your number3");
	     int num3=sc.nextInt();
	     

	  /*   if(num1>=num2 && num1>=num3) {
	    	 System.out.println("Largest Number is -->" +num1);
	     }else if (num2>=num3 && num2>=num1) {
	    	 System.out.println("Largest Number is -->" +num2);
	     }else {
	    	 System.out.println("Largest Number is -->" +num3 );
	     }*/
	     
	     //Using ternary
	     
	     int A =(num1>num3)?num1:num3;
	     int B= (num2>num3)?num2:num3;
	     int largest =(num1>num2)? A:B;
	     System.out.println(largest);
		sc.close();

	     
	}

}
