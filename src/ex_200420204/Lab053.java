package ex_200420204;

public class Lab053 {

	public static void main(String[] args) {
		
		int a =10;
		char c ='B';
         boolean b = true;

		//Primitive Data Type   ---don't have extra functionality
         // Because of Primitive Data Type  ---Java not OOPS
         //OOPS --Object oriented ---primitive
         // OOPS -- everything is class.
         //OOPS --- Fully--don't have anything which is not in class format/primitive
         //Java is not pure object oriented.
		
		//Non Primitive Data Type   --- have extra functionality  --> String 
		
		// TWO WAYS 
		String  name = "Bhuvi";//Assignment Operator
		String  name1 =  new String( "Bhuvi");//New Operator

        System.out.println(name);

        System.out.println("Your name is ----> " + name);

        System.out.printf("Your name is ----> %s " , name);
       
        System.out.println("\n--- ALL the functions avavilable in String ---");
        

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
	
        
	}

}
