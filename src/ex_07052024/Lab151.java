package ex_07052024;

public class Lab151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1=sum_of_two_number(9,7);
		System.out.println(r1);
		int r2=sum_of_two_number(11,89);
		System.out.println(r2);
		//int r3=sum_of_two_number("Bhuvi",5); // not matching 
		String  r3=sum_of_two_number("Bhuvi",5);
		System.out.println(r3);
		
		
		
		
	}
	static int sum_of_two_number(int a, int b) {
		   return a+b;  
	}
	static String sum_of_two_number(String a, int b) {//String 
		   return a+b;  
	}
}
