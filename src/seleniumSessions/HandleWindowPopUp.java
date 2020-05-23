package seleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
		
		driver.get("http://popuptest.com/goodpopups.html"); 

		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		Set<String> handler =driver.getWindowHandles();
		Iterator<String> abc =handler.iterator();
		
		String parentWindowId = abc.next();
		System.out.println("parent window id: " + parentWindowId);
		
		//shifting the iterator object
		String childWindowId = abc.next();
		System.out.println("child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child window pop up title: " + driver.getTitle());
		driver.close();
		
        driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window pop up title: " + driver.getTitle());
	
		
	}

}
