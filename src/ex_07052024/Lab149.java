package ex_07052024;

public class Lab149 {

	public static void main(String[] args) {
		// Can call function n number of times
		//can also use for loop
		for (int i =0; i<100; i++) {//100
			sayHi();
			sayBye();
		}
		

	}
	  static void sayHi() { // Define
		  System.out.println("Hello, Hi");
	  }
	  static void sayBye() { // Define
		  System.out.println("Bye");
	  }

}
