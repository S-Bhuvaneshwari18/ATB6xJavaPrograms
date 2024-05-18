package ex_02052024;

import java.util.Scanner;

public class Lab132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      float[] marks= new float[5];
      System.out.println("Enter Sub 1 mark");
      marks[0]=sc.nextFloat();
      System.out.println("Enter Sub 2 mark");
      marks[1]=sc.nextFloat();
      System.out.println("Enter Sub 3 mark");
      marks[2]=sc.nextFloat();
      System.out.println("Enter Sub 4 mark");
      marks[3]=sc.nextFloat();
      System.out.println("Enter Sub 5 mark");
      marks[4]=sc.nextFloat();
      
      
      for (int i=0 ; i<marks.length;i++) {
    	   if (marks[i]<30){
    		   System.out.println("Failed in this subject-->" + marks[i]);
    	   }
    	  System.out.println(marks[i]);
      }
      
      
      
      int j =0;
      while (j<marks.length) {
    	  System.out.println(marks[j]);
    	  j++;
      }
      sc.close();
      
      
	}

}
