package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {

		//System.setProperty("webdriver.safari.driver", "\\usr\\bin\\safaridriver\\safaridriver.exe");
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.selenium.dev/");
		
		System.out.println(driver.getTitle());

	}

}
