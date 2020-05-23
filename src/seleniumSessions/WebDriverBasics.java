//package seleniumSessions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.htmlunit.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WebDriverBasics {
//	public static void main(String[] args) {
//		
//	
//	System.setProperty("webdriver.gecko.driver", ".\\DriverExecutables\\geckodriver.exe");
//	WebDriver driverF = new FirefoxDriver();
//	driverF.get("https://www.google.com/");
//	
//	
//	System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//	WebDriver driverC = new ChromeDriver();
//   driverC.get("http://www.google.com/");
//   String title =driverC.getTitle();
//   System.out.println(title);
//   
//   if(title.equals("Google")) {
//	   System.out.println("correct title");
//   }
//   else {
//	   System.out.println("Incorrect title");
//   }
//   System.out.println(driverC.getCurrentUrl());
//   System.out.println(driverF.getPageSource());
//   driverC.quit();
//   driverF.quit();
//}
//}