package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SCHOOL {
	
		WebDriver driver;
		@Test
		public void school() {
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.w3schools.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
			 driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div[2]/a[9]")).click();
			 driver.findElement(By.id("topnavbtn_tutorials")).click();
			 driver.findElement(By.cssSelector("#nav_tutorials > span")).click();
			 driver.findElement(By.name("ex1")).sendKeys("System");
			 driver.findElement(By.name("ex2")).sendKeys("out");
			 driver.findElement(By.name("ex3")).sendKeys("println");
			 driver.findElement(By.cssSelector("#w3-exerciseform > div > button")).click();
			 

		}			
}
