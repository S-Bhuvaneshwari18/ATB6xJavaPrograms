package ex_27042024;

public class Lab099 {

	public static void main(String[] args) {
		// Fizzbuzz Test
      // Write a program that prints numbers from 1 to 100
		//However for multiples  of 3 , print "Fizz" instead of the number,
		//and for multiples  of 3 , print "Buzz"
		//for multiples  of  both 3 and 5  , print "FizzBuzz"
		
		//Loop 
		
		for ( int i =1; i<=100; i++) {
			if(i%3 ==0 && i%5==0) {
				System.out.println("Fizzbuzz");
			}else if(i%3 ==0 ) {
				System.out.println("Fizz");
		    }else if (i%5==0) {
			System.out.println("Buzz");
		   }else {
			System.out.println(i);
		   }
		
		}
		
		
	}

}
