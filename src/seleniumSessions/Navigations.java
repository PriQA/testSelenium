//package seleniumSessions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Navigations {
//
//	public static void main(String[] args) throws InterruptedException {
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
//		driver.navigate().to("https://www.youtube.com/");
//		
//		//back and forward buttons simulation:
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		driver.navigate().refresh();   //to refresh the page
//	}
//
//}
