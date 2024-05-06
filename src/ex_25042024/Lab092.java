package ex_25042024;

import java.util.Scanner;

public class Lab092 {

	public static void main(String[] args) {
		// Program to check Grade based on marks
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		
		//90--> 90/10=9-->A(90-100)
		//80--> 80/10=8-->B(80-89)
		//70--> 70/10=7-->C(70-79)
        marks = marks/10;
        System.out.println(marks);
        
        switch(marks) {
        case 9 :
        	 System.out.println("A");
        	 break;
        case 8 :
       	 System.out.println("B");
       	 break;
        case 7 :
       	 System.out.println("C");
       	 break;
        case 1 :
       	 System.out.println("F");
       	 break;
       default :
       	 System.out.println("None");
       	 
        }
	}

}
