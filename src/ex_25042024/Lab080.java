package ex_25042024;

import java.util.Scanner;

public class Lab080 {

	public static void main(String[] args) {
		// Switch --multiple conditins

		//which day it is?
		//Create a program - user will enter a number, we will  tell user which day it is
		
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the number  1-7 , I will tell you which day it is");
		int day =sc.nextInt();
		
		switch(day) {
		case 1:
            System.out.println("Mon");
            break;
		case 2:
            System.out.println("Tue");
            break;
		case 3:
            System.out.println("Wed");
            break;
		case 4:
            System.out.println("Thurs");
            break;
		case 5:
            System.out.println("Fri");
            break;
		case 6:
            System.out.println("Sat");
            break;
		case 7:
            System.out.println("Sun");
            break;
		 default:
            System.out.println("Invalid");
		}
        System.out.println("End of the program, I will be executed anyhow");
	}

}
