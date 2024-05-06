package ex_27042024;

public class Lab113 {

	public static void main(String[] args) {
		// Continue -->if this is true  continue  
		for(int i=0 ; i<10 ;i++) { //1 to 10
			 System.out.println(i);
			 
			 if(i==5) {
				 continue; // if i=5 then go back to for loop
			 }
			 System.out.println("After");
		 }
	}

}
