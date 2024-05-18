package ex_04052024;

public class Lab135 {

	public static void main(String[] args) {
		// Find the max in the Array
		int[] salaries = {30,50,60,90,10,100,999};
		//How to find the max salary in the array?
		//Loop --Logic --  max=0,  for i-0 to length
		//salaries[i] > max--> max .... 0 to l --max
		
		int max_salaries =Integer.MIN_VALUE;
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
		//int max_salaries=0 ; (-1, -2) logic will fail 
		for (int i=0 ; i<salaries.length ; i++) {
			if(salaries[i]>max_salaries) {
				max_salaries =salaries[i];
			}
			// can also do by while loop
		}
		System.out.println("Max salary is -->"+ max_salaries );
	}

}
