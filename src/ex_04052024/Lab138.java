package ex_04052024;

public class Lab138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [][] array_2d= { // type1
		    		 {34,12,11},
		    		 {36,12,34}
		    		 
		  };
		  int row =array_2d.length;
		  for (int i=0;  i < array_2d.length; i++) { // row ==>0,1
		    	 for (int j =0; j<array_2d[i].length ; j++) { //column ==>0,1,2
		    		 System.out.println(array_2d[i][j]);
		    	 }
		  }
	}

}
