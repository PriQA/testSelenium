//package seleniumSessions;
//
//import java.io.File;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.LocalFileDetector;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class HandleFileUploadPopUp {
//	
//	public static void main(String[] args) {
//	
//	System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//    driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//    
//    
//    driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\subhendu\\eclipse-workspace3\\SeleniumSessions\\text.txt");
//    driver.findElement(By.xpath("/html/body/form/input[3]")).click();
//
//}
//}