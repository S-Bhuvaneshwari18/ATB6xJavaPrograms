package ex_02052024;

public class Lab127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [ ] arr1= {23,45,56,67,89};
   int [ ] arr2= {23,45,56,67,89};
   
   System.out.println(arr1);
   System.out.println(arr2);
   System.out.println(arr1==arr2);
   
   int []arr3 = arr1;
   System.out.println(arr1==arr3);
   
   System.out.println(arr1.equals(arr2));//Objects .Java -reference
   
   
   String s1="Bhuvi";
   String s2 ="Bhuvi";
   System.out.println(s1.equals(s2));//Strings .Java -content /Value
   
	}

}
