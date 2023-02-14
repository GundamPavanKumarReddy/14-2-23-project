package Testing.seleniumAutomationProcess.coursesletscodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letsCodeItCheakBoxesTest5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='benzradio']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
