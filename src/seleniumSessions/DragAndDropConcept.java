//package seleniumSessions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class DragAndDropConcept {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://jqueryui.com/droppable/"); 
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		//dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		 
//		 
//		 driver.switchTo().frame(0); //no need to write this line if there are no other frames
//		 Actions action =new Actions(driver);
//		 
//		 action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
//		 .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
//		 .release()
//		 .build()
//		 .perform();
//		
//		
//	}
//
//}
