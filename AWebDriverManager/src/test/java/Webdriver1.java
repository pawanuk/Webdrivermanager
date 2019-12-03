import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().version("2.36").setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.co.uk");

		
	}

}
