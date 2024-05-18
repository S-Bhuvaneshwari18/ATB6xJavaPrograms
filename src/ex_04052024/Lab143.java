package ex_04052024;

public class Lab143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="Bhuvi";  //SCP
         String s2=new String ("Prabhu"); //OA
         
         //String --Immutable-->once created can't be changed.
         
         StringBuffer  stringBuffer = new  StringBuffer("Bhuvi");
         stringBuffer.append("Prabhu");
         System.out.println(stringBuffer );
         stringBuffer.reverse();
         System.out.println(stringBuffer);
         
         StringBuilder  stringBuilder = new  StringBuilder("Bhuvi");
         stringBuilder.append("Prathi");
         System.out.println(stringBuilder ); 
         
         
         String password ="@#bhu123";
         password = "123bhuvi"; //SCP--2 strings
         
         //Mutable that can be changed
         StringBuilder  password1 = new  StringBuilder("Bhuvi"); 
         password1.append("Prabhu");
         System.out.println(password1 );   //1 string 
	}

}
