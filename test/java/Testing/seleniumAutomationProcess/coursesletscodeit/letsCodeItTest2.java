package Testing.seleniumAutomationProcess.coursesletscodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letsCodeItTest2 {
	public void carsselect(int cartoSelect) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement carslist =driver.findElement(By.id("carselect"));
		Select cars=new Select(carslist);
		cars.selectByIndex(cartoSelect);
		Thread.sleep(4000);
	}
	public static void main(String[] args) throws InterruptedException {
		letsCodeItTest2 test=new letsCodeItTest2();
		test.carsselect(2);
		
	}

}
