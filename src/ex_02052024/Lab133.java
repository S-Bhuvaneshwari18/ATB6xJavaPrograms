package ex_02052024;

public class Lab133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fizzbuzz Test
		
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
