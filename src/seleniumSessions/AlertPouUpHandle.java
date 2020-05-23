//package seleniumSessions;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class AlertPouUpHandle {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", ".\\DriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	   driver.get("https://mypage.rediff.com/login/dologin");
//	   
//	   driver.findElement(By.id("btn_go")).click();
//	   Thread.sleep(5000);
//	   
//	   Alert alert = driver.switchTo().alert();
//	 System.out.println( alert.getText());
//	 
//	 String text =  alert.getText();
//	 
//	 if(text.equals("Please enter a valid email"))
//	 {
//		 System.out.println("correct alert message");
//	 }
//	 
//	 else {
//		 System.out.println("incorrect alert message");
//	 }
//	 
//	 
//	 alert.accept();
//	 //alert.dismiss(); //for cancel button
//	 
//	 
//
//	}
//
//
//}
