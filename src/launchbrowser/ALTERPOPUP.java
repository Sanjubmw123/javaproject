package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALTERPOPUP {
	WebDriver driver;
	@Test
	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
//		 driver.get("https://freecrm.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		 driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();
//		 driver.findElement(By.name("email")).sendKeys("sanjaybkr@hotmail.com");
//		 driver.findElement(By.name("password")).sendKeys("Test@123");
//		 driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
//		 driver.switchTo().frame("downloadFrame");
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		//getting message in console
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/ul/li[2]/a")).click();
	   driver.findElement(By.xpath("//html//body/div[1]/div/div/div/div[2]/div[2]/button" )).click();
	       System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 driver.findElement(By.xpath("//html/body/div/div/div/div/div[1]/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		 Thread.sleep(4000);
		 	driver.switchTo().alert().sendKeys("sanjubaba");
		    driver.switchTo().alert().accept();
}
	
}
