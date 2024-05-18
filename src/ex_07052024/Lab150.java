package ex_07052024;

public class Lab150 {

	public static void main(String[] args) {
		// No Return Function  --> Dedine--> Call
		//Return something
		int result = sum_of_two_number();
		System.out.println(result);
		//	double result = sum_of_two_number(); --> this is possible
		//	byte result = (byte) sum_of_two_number();-->explicit narrowing 

	}
   static int sum_of_two_number() {//If void then error , so change to int
	   return 5+6;  
   }
}
