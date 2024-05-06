package ex_25042024;

public class Lab087 {

	public static void main(String[] args) {
		// --> No need  to use break
    int itemcode = 002;
    switch(itemcode) {
	case 001 -> System.out.println("It is  a Desktop");
        
	case 002 ->System.out.println("It is  a Laptop");    
	case 003,004 ->System.out.println("It is a Mobile phone");
     
	default ->System.out.println("Hello");      
    }
    
    
    char ch='i';
    switch(ch) {
   	case 'a','e','i','o','u'-> System.out.println("It is  a Vowel");
   	default ->System.out.println("Consonant"); 
    }
	}

}
