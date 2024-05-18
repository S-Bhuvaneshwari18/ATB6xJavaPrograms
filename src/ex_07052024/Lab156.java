package ex_07052024;

public class Lab156 {

	public static void main(String[] args) {
		//Not calling the function
		System.out.println("Start of the program");
		
	    System.out.println("End of the program");
	    
	    //Function within function is not possible  -->main is a function 
	    /*static void givemoneyBegger( ) { // Define
			  System.out.println("Blessings");
	    */
	    
	    main(10);
	    main("bhuvi");
	    
	    
	    
		}
	
	//One function (god)can call main function
	static void god() { 
		 main(new String[] {"12"});
	}
	
	static String main(String[]a, String b ) { 
		 System.out.println(a);
		 return "Hi";
	}
	static void main(String a) { 
		System.out.println(a);
	}
	
	static void main(int a) { 
		System.out.println(a);
	}
	
	

		static void givemoneyBegger( ) { // Define
			  System.out.println("Blessings");
			  
		  }
		
		static int givemoneyFriend(int a) { // Define
		   a=a-10;// a=a+8; a=a*2;
			return a;
	}

}
