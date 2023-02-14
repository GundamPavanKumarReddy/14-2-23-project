package Testing.seleniumAutomationProcess.mouseoperations;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightClickOperationsText1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclickoption=driver.findElement(By.xpath("//span[.='right click me']"));
		Thread.sleep(3000);
		Actions action =new Actions(driver);
		
		action.contextClick(doubleclickoption).perform();
		WebElement suboptions=driver.findElement(By.xpath("//li/span[text()='Copy']"));
		Thread.sleep(3000);
		suboptions.click();
		
		
		Alert alert=driver.switchTo().alert();
		
		String alert_message=alert.getText();
		System.out.println(alert_message);
		alert.accept();
		
		
		
	}

}
