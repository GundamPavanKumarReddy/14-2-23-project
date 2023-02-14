package Testing.seleniumAutomationProcess.syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicityWaitText2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.get("https://courses.letskodeit.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gundampavan789@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gppkr@2687");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		String actual_Url=driver.getCurrentUrl();
		String expected_Url="https://courses.letskodeit.com/login";
		if(actual_Url.equals(expected_Url)) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
			
		
		
	}

}
