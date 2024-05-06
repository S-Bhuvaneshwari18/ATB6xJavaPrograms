package ex_27042024;

import java.util.Scanner;

public class Lab124 {

	public static void main(String[] args) {
		// Program to perform Arithmetic operation
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            int input_1 = sc.nextInt();
            System.out.println("Enter num2");
            int input_2 = sc.nextInt();
            System.out.println("Enter Operation  +,-,/,*,%");
            char Operator  = sc.next().charAt(0);
            
            switch(Operator) {
            case '+':
            	  System.out.println("Result: " + (input_1+input_2));
            	  break;
            case '-':
          	  System.out.println("Result: " + (input_1 - input_2));
          	  break;
            case '*':
          	  System.out.println("Result: " + (input_1*input_2));
          	  break;
            case '/':
          	  System.out.println("Result: " + (input_1/input_2));
          	  break;
            case '%':
          	  System.out.println("Result: " + (input_1%input_2));
          	  break;
           default :
          	  System.out.println("Invalid Operator ");
          	  break;
            }
            
           sc.close() ;
	}

}
