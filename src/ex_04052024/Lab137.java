package ex_04052024;

public class Lab137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int []a= {20,30,45};
  
  
      //2d array --- rows and columns 
  //rows -->horizontal
  //columns --> vertical
  
     int [][] array_2d= { // type1
    		 {34,12,11},
    		 {36,12,34},
    		 {11,23,98}
     };
  
     
    /* int [][] array_2d_2 = new int [3][3]; //type2
     //  |0,0,0|
     //|0,0,0|
     //|0,0,0|
     array_2d_2 [0][0]= 34; // |34,0,0|
     //|0,0,0|
     //|0,0,0|
     

     array_2d_2 [0][1]= 32;  //  |0,32,0|
     //|0,0,0|
     //|0,0,0|
     
     */
     for (int i=0;  i < array_2d.length; i++) {
    	 for (int j =0; j<array_2d.length ; j++) {
    		 System.out.println(array_2d[i][j]);
    	 }
     }
     //i=0 , j=0,1,2
     //i=1 , j=0,1,2
     //i=2 , j=0,1,2
	}

}
