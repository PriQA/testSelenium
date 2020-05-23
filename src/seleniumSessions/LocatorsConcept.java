//package seleniumSessions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LocatorsConcept {
//
//	public static void main(String[] args) throws InterruptedException {
//	
//			   
//		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	   driver.get("https://login.yahoo.com/");
//
//	   //1. id:
//	   WebElement username=driver.findElement(By.id("login-username"));
//	   username.sendKeys("testnaveen@yahoo.com");
//	   Thread.sleep(2000);
//	   
//	   
//	   WebElement nextBtn=driver.findElement(By.id("login-signin"));
//	   nextBtn.click();
//	   
//	   
//	   driver.findElement(By.id("login-username")).sendKeys("testnaveen@yahoo.com");
//	   driver.findElement(By.id("login-signin")).click();
//	   
//	   
//	   //2. name:
//	   
//	   
//	   driver.findElement(By.name("username")).sendKeys("testnaveen@yahoo.com");
//	   driver.findElement(By.name("signin")).click();
//	   
//	   //3. xpath
//	   
//	   
//	   
//	   driver.findElement(By.xpath("//[@id=\'login-username\']")).sendKeys("testnaveen@yahoo.com");
//	   driver.findElement(By.xpath("//[@id=\'login-signin\']")).click();
//	   
//	   //4. cssSelector:
//	   
//	   driver.findElement(By.cssSelector("#login-username")).sendKeys("testnaveen@yahoo.com");
//	   driver.findElement(By.cssSelector("#login-signin")).click();
//	   
//	   //5.linkText only for links
//	   
//	   driver.findElement(By.linkText("Forgot username?")).click();
//	   driver.findElement(By.linkText("Create an account")).click();
//	   
//	   //6. partiallinkText (not recommended)
//	   
//	   driver.findElement(By.partialLinkText("Forgot")).click();
//	   
//	   //7. class name 
//	   
//	   driver.findElement(By.className("phone-no show-icon")).sendKeys("testnaveen@yahoo.com");
//	   driver.findElement(By.className("orko-button-primary orko-button challenge-button")).click();
//	   
//	   
//	   
//	}
//
//}
