package ex_25042024;

public class Lab089 {

	public static void main(String[] args) {
		// Rarely used 
         char code = 'A';
         int val = switch (code) { //Output int val =65
         case 'A':
        	 yield 65;
         case 'B':
        	 yield 66;
        default :
            System.out.println("Not able to find");
         throw new IllegalStateException("Error");
         
           };
         }
        		 
       
        		 }


