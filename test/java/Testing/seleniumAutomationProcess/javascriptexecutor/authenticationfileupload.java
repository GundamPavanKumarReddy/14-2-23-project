package Testing.seleniumAutomationProcess.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authenticationfileupload {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement file_box=driver.findElement(By.cssSelector("input#file-upload"));
		file_box.sendKeys("C:\\Users\\admin\\Desktop\\Java classes");
		driver.findElement(By.cssSelector("input#file-submit")).click();
				
	}

}
