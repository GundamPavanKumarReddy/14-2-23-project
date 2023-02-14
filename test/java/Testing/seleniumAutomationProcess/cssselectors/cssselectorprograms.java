package Testing.seleniumAutomationProcess.cssselectors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssselectorprograms {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.cssSelector("input#name")).sendKeys("pavan kumar");
		driver.findElement(By.cssSelector("input.btn-style")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		driver.findElement(By.cssSelector("input[value$=Confirm]")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(3000);
		alert1.accept();
		
	}

}
