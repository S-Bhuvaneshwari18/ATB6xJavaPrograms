package ex_23042024;

import java.util.Scanner;

public class Lab076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	    // System.out.println("Enter your number");
		int num =sc.nextInt();
		if (num >20) {
		     System.out.println("num>20");
		}else if (num>10){
		     System.out.println("num is between  10 and 20");
		}else {
			System.out.println("num<20");
		}
      sc.close();
	}

}
