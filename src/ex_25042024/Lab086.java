package ex_25042024;

public class Lab086 {

	public static void main(String[] args) {
		// JDK>13 -->will work
		
		int itemcode=010;
		switch(itemcode) {
		case 001,002,003:
            System.out.println("It is Electronic Gadget");
            break;
            
		case 006,007,010:
            System.out.println("It is Mechanical Gadget");
            break;
		default:
            System.out.println("Invalid");        
            
		}
	}

}
