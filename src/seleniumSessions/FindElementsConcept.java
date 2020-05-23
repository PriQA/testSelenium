//package seleniumSessions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FindElementsConcept {
//
//	public static void main(String[] args) {
//	
//		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.ebay.com/"); 
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		//dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		List<WebElement> linklist = driver.findElements(By.tagName("a"));
//		
//		System.out.println(linklist.size()); //size of linklist or how many links r there
//		
//		for(int i=0;i<linklist.size();i++) {
//			
//			linklist.get(i).getText();
//			String linkText = linklist.get(i).getText();
//			System.out.println(linkText);
//		}
//		
//		
//		
//
//	}
//
//}
