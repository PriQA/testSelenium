//package seleniumSessions;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TakeScreenshot {
//
//	public static void main(String[] args) {
//	
//		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		//dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		driver.get("https://www.google.com/"); 
//		
//		//Take screenshot & store as a file format
//		
//		File src =((TakeScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		//copy the screenshot to desired location using copyfile method
//		
//		FileUtils.copyFile(src, new File("C:\\Users\\subhendu\\eclipse-workspace3\\SeleniumSessions\\src\\seleniumSessions\\google.png"));
//		
//		
//
//	}
//
//}
