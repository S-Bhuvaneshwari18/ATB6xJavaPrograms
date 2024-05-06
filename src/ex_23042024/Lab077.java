package ex_23042024;

import java.util.Scanner;

public class Lab077 {

	public static void main(String[] args) {
		// grade Calculator
		//Write a program that calculates and display the letter   grade 
		//for a given numerical score (e.g., A,B,C,D,  or F) based on the following 
		//Grading scale:
		//A:90-100
		//B: 80-89	
		//C: 70-79
		//D:60-69
        //F:0-59
	
		//1.Find the user input
		//score --data type -int
		//return--> grade -->data type --char 
		
		//2. Basic logic
		//if(score >90 && score <100)-->return or print --A
		//else if ....-->B, C,D 
		//else -->F
		
		//Write the code
		
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter your Student score");
		int score =sc.nextInt();
		
		char grade = 'F';
		if (score >=90 && score <100) {
			grade = 'A';
			
		}else if (score >=80 && score <=89) {
			grade = 'B';
		}	else if (score >=70 && score <=79) {
			grade = 'C';
		}else if (score >=60 && score <=69) {
			grade = 'D';
		}else if (score <=0  && score >100) {
		     System.out.println("LOL");	
   		
		}else {
			grade =  'F';
			
		}
	     System.out.println("Your grade is -->" + grade);
		
		
	   sc.close();
	
	
	}

}
