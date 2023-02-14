package Testing.seleniumAutomationProcess.frames;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setmodalText2 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		for(String window:allwindows) {
			driver.switchTo().window(window);
			String act_Url=driver.getCurrentUrl();
			if(act_Url.equals("https://letcode.in/alert")) {
				driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destFile=new File("C:\\Users\\admin\\OneDrive\\Pictures\\Screenshots/jpg");
				FileUtils.copyFile(src, destFile);
			}
		}
		driver.switchTo().window(parent_window);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.quit();
		
	
	}

}
