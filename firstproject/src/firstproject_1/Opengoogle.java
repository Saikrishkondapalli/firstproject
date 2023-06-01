package firstproject_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kondapalli.krishna\\chromeDriver_101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");

	}

}
