package Testing.seleniumAutomationProcess.coursesletscodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letsCodeItRedioButtonTest4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='hondaradio']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
