package ex_02052024;

public class Lab125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []a=new int[4];//0,1,2,3
         //defaults=a[0,0,0,0]
         //JVM =|0,0,0,0|
        // a[5]=90;//java.lang.ArrayIndexOutOfBoundsException: 
        // a[4]=45; // java.lang.ArrayIndexOutOfBoundsException:
         a[3]=69;	
         System.out.println(a[3]);
	}

}
