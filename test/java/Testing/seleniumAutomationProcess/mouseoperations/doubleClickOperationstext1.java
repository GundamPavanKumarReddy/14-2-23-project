package Testing.seleniumAutomationProcess.mouseoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClickOperationstext1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclick_element=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		Actions action=new Actions(driver);
		
		action.doubleClick(doubleclick_element).perform();
		
		Alert alert=driver.switchTo().alert();
		
		String alertmessage=alert.getText();
		System.out.println(alertmessage);
		alert.accept();
		
	}

}
