package ex_200420204;

public class Lab064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String password = "Bhuvi@369";
         String pass_u = password.toLowerCase();// bhuvi@369
         
         System.out.println(password == pass_u);  //Bhuvi@369
		  
		  System.out.println(password.equals(pass_u)); //bhuvi@369
		  
		  System.out.println(password.equalsIgnoreCase(pass_u)); //"Bhuvi@369";  -->Checks only value
		  
		  System.out.println(password.substring(0,3));  //0--included , 3 --excluded  (0 to 2)
		  System.out.println(password.indexOf("v"));  
		  
	}
}
