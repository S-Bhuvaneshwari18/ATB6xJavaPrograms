/**
 * 
 */
package ex_25042024;

import java.util.Scanner;

public class Lab081 {
	public static void main(String[] args) {
		
		//Web Automation
		//I will ask user which browser you want  me to run the code  -- chrome, firefox, edge 
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the browserName!! ,where  you want to  execute the program!");
		String  browserName  =sc.nextLine();
		browserName = browserName.toLowerCase();
		switch(browserName) {
		case "chrome":
            System.out.println("Starting th chrome browser");
            //further code to start the chrome -->	Webdriver driver =  new Chrome(); //Selenium code
            break;
		case "firefox":
            System.out.println("Starting th firefox browser");
            //further code to start the firefox -->	Webdriver driver =  new Firefox(); //Selenium code
            break;
		case "edge":
            System.out.println("Starting th edge browser");
            break;
            
         default:
             System.out.println("I have no idea which browser  is this");
		}
	}
}
