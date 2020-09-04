package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {

	WebDriver driver;

	@Test
	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("dekho frame sunita &jyoti");
	}
}