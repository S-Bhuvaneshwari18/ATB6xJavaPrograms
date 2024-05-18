package ex_04052024;

public class Lab136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int []arr1 = {20,30,45};//Horizontal array /1D array
   int [] arr2= new int[3];
   for (int i =0 ; i<arr1.length; i++) {
	   arr2[i]=arr1[i]*2;//-->only doubling 
	   //System.out.println(arr2[i]);
   }
    System.out.println("Printing th array");
    for (int i =0; i<arr2.length; i++) {
    	System.out.println(arr2[i]);// Storing the array
    }
   
   
	}

}
