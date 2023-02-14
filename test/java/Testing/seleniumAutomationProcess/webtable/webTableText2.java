package Testing.seleniumAutomationProcess.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableText2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		String path="//label[text()='Sortable Tables']/parent::div//tr/td[text()='%s']";
		String text="Eclair";
		String cheak=driver.findElement(By.xpath(String.format(path, text))).getText();
		System.out.println(text+""+cheak);
		
	}
	

}
