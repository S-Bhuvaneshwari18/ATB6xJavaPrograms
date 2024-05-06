package ex_23042024;

import java.util.Scanner;

public class Lab075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter your number1");
		int num1 =sc.nextInt();
		System.out.println("Enter your number2");
		int num2 =sc.nextInt();
		
		
		/*  int max = Math.max(num1, num2);
	     System.out.println("Max by Math.max fun()" + max);
		*/  //----Type1
		if (num1>num2) {
			//C1--> num1 >num2
			//C2--> num12>num1
			//C3--> num1 == num2
			
		     System.out.println("Max is -->" + num1);
		}else {
		     System.out.println("Max is -->" + num2);
		} //Type2
      sc.close();
	}

}
