package Testing.seleniumAutomationProcess.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptExecutortext1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		WebElement text_box=driver.findElement(By.cssSelector("div#alert-example-div>fieldset>input#name"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='Pavan Kumar';", text_box);
		WebElement mouse_button=driver.findElement(By.cssSelector("button#mousehover"));
		js.executeScript("arguments[0].scrollIntoview;", mouse_button);
		WebElement top_button=driver.findElement(By.xpath("//a[text()='Top']"));
		js.executeScript("arguments[0].click;", top_button);		
	}

}
