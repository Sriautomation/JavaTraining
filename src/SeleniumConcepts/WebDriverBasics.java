package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// 1. Firefox
		// geckodriver
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();// launch firefox

		// 2. Chrome
		// chromedriver
		// Sytem.setProperty("webdriver.chrome.driver","C:\\Users\\Ads\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://www.selenium.dev/");// launch url

		String title = driver.getTitle();// get title

		// validation point:
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("In-correct title");
		}

		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
