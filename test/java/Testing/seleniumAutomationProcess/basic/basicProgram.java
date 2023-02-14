package Testing.seleniumAutomationProcess.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicProgram {
	public static void main(String[] args) {
		String projectlocation = System.getProperty("User.dir");
		System.out.println(projectlocation);

		System.getProperty("webdriver.chrome.driver",  "pathofchromedriver.exefile");
		WebDriver driver=new ChromeDriver();
	}


}
