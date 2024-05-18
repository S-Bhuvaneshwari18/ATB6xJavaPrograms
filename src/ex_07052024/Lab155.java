package ex_07052024;

public class Lab155 {

	public static void main(String[] args) {
		// Friend -money
		//Beg -money
		System.out.println("Start of the program");
	int r=	givemoneyFriend(100);
		System.out.println(r);
		
		givemoneyBegger();
		
		System.out.println("End of the program");
	}

	static void givemoneyBegger( ) { // Define
		  System.out.println("Blessings");
		  
	  }
	
	static int givemoneyFriend(int a) { // Define
	   a=a-10;// a=a+8; a=a*2;
		return a;	
	    //return 0;-->  nothing return
	}
}
