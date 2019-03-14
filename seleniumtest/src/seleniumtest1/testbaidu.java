package seleniumtest1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbaidu {
	@Test
	public void openchrome() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
	}
}
