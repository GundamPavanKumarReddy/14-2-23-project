package Testing.seleniumAutomationProcess.syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicityWaitTest2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		WebElement text1=driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input"));
		text1.sendKeys("Pavan Kumar Reddy");
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		WebElement text2=driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input[2]"));
		text2.sendKeys("Gundam Pakkireddy Gari");
		driver.close();
		
		
		
	}

}
