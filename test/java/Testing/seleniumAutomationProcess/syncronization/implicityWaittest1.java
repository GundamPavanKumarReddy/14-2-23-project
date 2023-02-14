package Testing.seleniumAutomationProcess.syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicityWaittest1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		WebElement textbox1=driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input"));
		textbox1.sendKeys("Pavan KumarReddy");
		driver.findElement(By.xpath("//button[text()='Add Textbox2']")).click();
		WebElement textbox2=driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input[2]"));
		textbox2.sendKeys("Gundam Pakkireddy Gari");
		driver.close();
		
	}

}
