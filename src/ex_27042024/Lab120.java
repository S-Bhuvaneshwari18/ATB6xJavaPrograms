package ex_27042024;

import java.util.Scanner;

public class Lab120 {

	public static void main(String[] args) {
		// Factorial Program 
		
	//1! = 1
		//2!=2*1 =2
		//3!=3*2*1=6
		//4!=4*3*2*1=24
		//5!=5*4*3*2*1=120
		
		//5-->int i=1, 5<5, 1
		//A -int i=1
		//B--> i<=num
		//C-->i++
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter num:");
		int num = sc.nextInt();
		
		long fact =1;
		
		for (int i=1; i<=num ; i++) { //num:5
			fact = fact*i;
		}
		 System.out.println(fact);//fact:120
		 sc.close();
	}

}
