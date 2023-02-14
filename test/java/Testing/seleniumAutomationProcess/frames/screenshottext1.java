package Testing.seleniumAutomationProcess.frames;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshottext1 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://letcode.in/signin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gundampavan789@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gppkr@2687");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\admin\\OneDrive\\Pictures\\Screenshots.jpg");
		FileUtils.copyFile(src, destfile);
	}

}
