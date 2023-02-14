package Testing.seleniumAutomationProcess.allerttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letscodeitAlertTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pavan Kumar Reddy");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert=driver.switchTo().alert();
		String alertmessage=alert.getText();
		System.out.println("alertmessage is"+alertmessage);
		alert.accept();
		driver.close();
	}

}
