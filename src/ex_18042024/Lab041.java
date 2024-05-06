package ex_18042024;

public class Lab041 {

	public static void main(String[] args) {
		// Casting --> Molding
		
		byte b =  10;
		int a =b; // Implicit Casting --> JVM (You don't have to specify)
		int a1 = (int)b; // Explicit Casting --> JVM (You have to specify)
        // Narrowing--> Converting  higher type to lower type(Only Explicit valid))   -->   int to byte 
		//Widening--> Converting  lower type to higher type  (Both Explicit and Implicit valid)  --> byte to int 
	}

}
