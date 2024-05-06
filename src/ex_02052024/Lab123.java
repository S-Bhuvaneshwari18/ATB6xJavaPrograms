package ex_02052024;

public class Lab123 {

	public static void main(String[] args) {
		// Arrays-Collection of similar data type
		
		int [] ages = {25,27,29,30,35};
		  System.out.println(ages[0]); // willprint --[I@6f539caf --reference
		  System.out.println(ages[1]);
		  System.out.println(ages[2]);
		  System.out.println(ages[3]);
		  System.out.println(ages[4]);
		  System.out.println(ages.length);
		  System.out.println(ages[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		                          //Index 5 out of bounds for length 5
		  System.out.println(ages[-1]);//Index -1 out of bounds for length 5
		//int [] ages = new int[5];

	}

}
