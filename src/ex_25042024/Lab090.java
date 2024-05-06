package ex_25042024;

import java.util.Scanner;

public class Lab090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the value  for x"); //10
		double x  =sc.nextDouble();
		System.out.println("Enter the value  for y");//12.4
		double y  =sc.nextDouble();
		System.out.println("Enter the value  for z");//56.78
		double z  =sc.nextDouble();
		
		double result;  //5.818450952275738
		
		//3/x^2+y^2-|z|
		//A+B-C , A-->x^2 , B-->y^2, C-->|Z|abs(Z)-->  -1=1, -2=2
		
		result =Math.cbrt(Math.pow(x, 2)+Math.pow(y, 2)-Math.abs(z));
        System.out.println(result);
        
		sc.close();
		
	}
	
	

}
