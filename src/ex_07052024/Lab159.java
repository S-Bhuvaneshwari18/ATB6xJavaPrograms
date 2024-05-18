package ex_07052024;

public class Lab159 {

	public static void main(String[] args) {
		//Web Automation
		OpenBrowser();
		TestLoginPage1();
		TestLoginPage2("Page2");
		CloseBrowser();
		 
		//Call multiple times
		
		OpenBrowser();
		TestLoginPage2("Page3");
		CloseBrowser();
		
		OpenBrowser();
		TestLoginPage2("Page4");
		CloseBrowser();
		
		OpenBrowser();
		TestLoginPage2("Page5");
		CloseBrowser();
		
		
		
	}
	static void OpenBrowser(){ 
		System.out.println("Open Chrome browser");
	}
	static void TestLoginPage1(){ 
		System.out.println("Testing Page1 Opened");
	}
	static void TestLoginPage2(String page){ 
		System.out.println("Testing -->"+page);
	}
	static void CloseBrowser(){ 
		System.out.println("Close Chrome browser");
	}
}
