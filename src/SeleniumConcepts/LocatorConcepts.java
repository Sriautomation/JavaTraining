package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ads\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");

		// 1.x path -- 2
		// absolute xpath should not be used -- html body
		//only relative xpath should be used -- //input[@id='firstname']
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Mathi");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("srimathibalakrishnan3@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Srimathi75");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();

		// 2. id:-- 1

		driver.findElement(By.id("firstname")).sendKeys("Sri");
		driver.findElement(By.id("lastname")).sendKeys("Mathi");

		// 3. name: -- 3

		driver.findElement(By.name("firstname")).sendKeys("Sri");
		driver.findElement(By.name("lastname")).sendKeys("Mathi");

		// 4. LinkText: This is only for the links

		driver.findElement(By.linkText("Login")).click();

		// 5. Partial LinkText: not useful

		driver.findElement(By.partialLinkText("How to")).click();

		// 6. CSSSeletor -- 2

		driver.findElement(By.cssSelector("#address1")).sendKeys("39 srinivasa nagar");

		// 7. class name  : not useful --- 4

		driver.findElement(By.className("ancAsb")).click();

	}

}
