package ex_200420204;

public class Lab059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Constant Pool
				String  name = "Bhuvi"; //v
				String  name1 = "Bhuvi";//V
				
				//Heap Area or Object Area
				String  name2 =  new String( "Bhuvi");
				
				  System.out.println(name == name1);  //Check the Reference (name)
				  
				  System.out.println(name.equals(name1)); // Check the Value(bhuvi)
				
				  System.out.println(name == name2);  
				  System.out.println(name.equals(name2)); // Check the Value(bhuvi)
				
				  
				  
	}

}
