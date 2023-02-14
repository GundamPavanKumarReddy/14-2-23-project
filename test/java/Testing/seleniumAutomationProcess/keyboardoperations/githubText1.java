package Testing.seleniumAutomationProcess.keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class githubText1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		WebElement forgot_link=driver.findElement(By.partialLinkText("Forgot"));
		String action_to_perform=Keys.chord(Keys.CONTROL,Keys.ENTER);
		forgot_link.sendKeys(action_to_perform);
		driver.get("http://omayo.blogspot.com/");
		WebElement onlytestingb_log=driver.findElement(By.linkText("onlytestingblog"));
		Actions action=new Actions(driver);
		action.moveToElement(onlytestingb_log).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
				
	}

	

}
