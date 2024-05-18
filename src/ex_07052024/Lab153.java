package ex_07052024;

public class Lab153 {

	public static void main(String[] args) {
		// 4 Types of Function 
		//No return with no parameter
		saySomething();
		//No return with  parameter
		  sayHello("bhuvi");
		//Return with no parameter
		  sumOTwoBad(3,4);//doubt
  //return with  parameter
		   int r1=sumOTwoGood(8,9);
		  System.out.println(r1);
	}
	static void saySomething( ) { // Define
		  System.out.println("No return with no parameter");
	  }
	
	
	static void sayHello(String name) { // Define
		  System.out.println("Hello," + name);
		  
	  }
	
	static void sumOTwoBad(int a, int b ) { // Define
		  System.out.println(a+b);
		  
	}
	static int sumOTwoGood( int a, int b ) { // Define
		 return a+b;
	}
	
}
