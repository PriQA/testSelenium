//package seleniumSessions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class MouseMovement {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		//dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		
//        driver.get("https://www.qatarairways.com/en-us/homepage.html"); 
//        
//        
//        //dropdown
//        
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.linkText("Discover"))).build().perform();;
//
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("Food")).click();
//	}
//
//}
