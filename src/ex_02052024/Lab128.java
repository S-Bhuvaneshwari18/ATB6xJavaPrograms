package ex_02052024;

public class Lab128 {

	public static void main(String[] args) {
		// 2 ways -- {} , new
		 int a[]= {27,31,34,35};
		 
		 //int[] a= {27,31,34,35}; both are same
		 
		  System.out.println(a.length);
		  //how to  print  all the elements ? Loop-For
		  
		  for ( int i=0; i<a.length; i++) { // arrays index starts from 0  so i =0  
			  //if start from 1 then 27 will not print
			  System.out.println(a[i]);
		  }
		  
		 
	}

}
