package Testing.seleniumAutomationProcess.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letCodeCreation2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/signin");
		driver.findElement(By.name("email")).sendKeys("gundampavan789@gmail.com");
		driver.findElement(By.name("password")).sendKeys("gppkr@2687");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(5000);
		String expectedurl="https://letcode.in/";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl)) {
			System.out.println("letcode is login successfully");
		}
		

	}

}
