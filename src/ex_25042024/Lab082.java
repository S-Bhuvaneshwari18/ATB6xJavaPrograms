package ex_25042024;

import java.util.Scanner;

public class Lab082 {

	public static void main(String[] args) {
		//Take a user input as char and tell the user if it is a vowel
		//aeiou
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a char and  I will tell the  if it is a vowel or not");
  		//A-->"A" --->index - A
		char  user_input = sc.next().toCharArray()[0]; //sc.next().charAt(0)
        System.out.println(user_input);
        
    	switch(user_input) {
		case 'a':
            System.out.println("Vowel");
            break;
		case 'e':
            System.out.println("Vowel");
            break;
		case 'i':
            System.out.println("Vowel");
            break;
		case 'o':
            System.out.println("Vowel");
            break;
		case 'u':
            System.out.println("Vowel");
            break;
		 default:
            System.out.println("Not a Vowel");
		}
        
      sc.close();
	}

}
