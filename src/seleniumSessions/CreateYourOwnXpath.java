//package seleniumSessions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CreateYourOwnXpath {
//
//	public static void main(String[] args) {
//		
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
//
//	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("hair diffuser");
//		
//		//driver.findElement(By.xpath("//input[@name=\'_nkw\']")).sendKeys("hair diffuser");
//		
//		//driver.findElement(By.xpath("//input[contains(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("hair diffuser");
//	
//	
//	//dynamic id: input
//	//id =test _123
//	//By.id("test_123)
//	
//	//starts with
//	//id =test_456
//	//id =test_789
//	
//	
//	//ends with
//	//id = 1234_test_t
//	//id= 2345_test_t
//	
//	//driver.findElement(By.xpath("//input[contains[@id='test_')]")).sendKeys("hair diffuser");
//	//driver.findElement(By.xpath("//input[starts-with[@id='test_')]")).sendKeys("hair diffuser");
//	//driver.findElement(By.xpath("//input[ends-with[@id='_test_t')]")).sendKeys("hair diffuser");
//	
//	
//	//for links
//	
//	driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();
//	
//	}
//
//}
