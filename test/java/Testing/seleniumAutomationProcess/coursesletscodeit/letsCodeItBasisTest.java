package Testing.seleniumAutomationProcess.coursesletscodeit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letsCodeItBasisTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement Multidropdown=driver.findElement(By.id("multiple-select-example"));
		Select fruits=new Select(Multidropdown);
		fruits.selectByValue("Peach");
		fruits.selectByIndex(0);
		List<WebElement>Selectedfruits=fruits.getAllSelectedOptions();
		for(WebElement fruit:Selectedfruits) {
			System.out.println(fruit.getText());
			
		}
		
	
	}
	

}