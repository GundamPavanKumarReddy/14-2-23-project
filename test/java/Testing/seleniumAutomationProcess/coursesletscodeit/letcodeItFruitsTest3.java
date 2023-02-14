package Testing.seleniumAutomationProcess.coursesletscodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letcodeItFruitsTest3 {
	public static void multiFruitSelect(String selectByValue,String deselectByVale ) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement fruitslist=driver.findElement(By.id("multiple-select-example"));
		Select fruits=new Select(fruitslist);
		fruits.selectByVisibleText(selectByValue);
		Thread.sleep(4000);
		fruits.deselectByVisibleText(deselectByVale);
		Thread.sleep(4000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		multiFruitSelect("Apple","Apple");
		
	}
	

}
