package ex_04052024;

import java.util.Scanner;

public class Lab144 {

	public static void main(String[] args) {
		// Palindrome
		//naman--reverse -naman
        //1331-->1331 
		//Malayalam , mom, madam.
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a string, I will check is it is Palindrome or not");
		  String str_input =sc.next();
		  

	        StringBuilder  sb = new  StringBuilder(str_input);
	        String rev_str_input= sb.reverse().toString();
		    if (str_input.equalsIgnoreCase(rev_str_input)) {
		    	 System.out.println("Palindrome  -->" +str_input);
		     }else {
		    	 System.out.println("Noope");
		     }
		
	} 

}
