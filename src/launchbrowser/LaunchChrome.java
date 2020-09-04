package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\Spring2020\\firstproject\\Driver\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\Spring2020\\firstproject\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
driver.close();
	//driver.quit();
}
}