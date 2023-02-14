package Testing.seleniumAutomationProcess.keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letscodeCapital {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		WebElement text_box=driver.findElement(By.xpath("//input[@name='enter-name']"));
		Actions action=new Actions(driver);
		action.click(text_box).keyDown(Keys.SHIFT).sendKeys("pavan kumar reddy").keyUp(Keys.SHIFT).perform();
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
