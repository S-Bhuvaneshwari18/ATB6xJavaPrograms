package ex_07052024;

public final class Lab157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       f1();
     String[]names = {"bhuvi", "Prabhu"};
     f1(names);
     String[]names1 = new String[2];
     names1[0]="aravind";
     names1[1]="tamil";
     f1(names1);
      //Parameter can be any data type -->Primitive and nin-primitive 
	}
	static void f1(String[]a){ //different
		for(String name :a)// for each loop
			// can also use for loop
			/* for( int i=0; i < a.length ; i++){syso(a[i]}
			 */
		System.out.println(name);
	}
	
	static void f1() { 
		f2();
		System.out.println("F1");
	}
	static void f2(){ 
		System.out.println("F2");
	}
}
