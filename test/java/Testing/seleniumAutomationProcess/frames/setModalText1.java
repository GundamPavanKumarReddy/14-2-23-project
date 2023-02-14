package Testing.seleniumAutomationProcess.frames;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setModalText1 {
	

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		String enter_action=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Forgot password?")).sendKeys(enter_action);
		Set<String>allwindows=driver.getWindowHandles();
		for(String windows:allwindows) {
			driver.switchTo().window(windows);
			if(enter_action.equals("https://github.com/password_reset")) {
			driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("gundampavan789@gmail.com");
			}
		}
//		driver.switchTo().window(parent_window);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
