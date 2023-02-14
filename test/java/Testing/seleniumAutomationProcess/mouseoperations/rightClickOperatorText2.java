package Testing.seleniumAutomationProcess.mouseoperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightClickOperatorText2 {
	public void clickOperation(String sub_option){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[.='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).perform();
		List<WebElement>suboption=driver.findElements(By.xpath("//li/span"));
		for(WebElement option:suboption) {
			if(option.getText().equals(sub_option)) {
				option.click();
				break;
			}
		}
		Alert alert=driver.switchTo().alert();
		String alert_message=alert.getText();
		System.out.println(alert_message);
		alert.accept();
		driver.close();
	}
	public static void main(String[] args) {
		rightClickOperatorText2 demo=new rightClickOperatorText2();
		demo.clickOperation("Copy");
	}
	

}
