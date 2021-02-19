package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentone {

	WebDriver driver;

	@Before

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void logintest15() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-university']")).click();
		driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[10]/ul/li[1]/a")).click();
		driver.findElement(By.id("account")).sendKeys("Subin Shrestha");
		driver.findElement(By.id("description")).sendKeys("Personal Saving");
		driver.findElement(By.id("balance")).sendKeys("5000");
		driver.findElement(By.id("account_number")).sendKeys("977014481993");
		driver.findElement(By.cssSelector("input[type='text'][id='contact_person']")).sendKeys("Subin");
		driver.findElement(By.id("contact_phone")).sendKeys("4696574635");
		// `driver.findElement(By.cssSelector("#page-wrapper >
		// div.wrapper.wrapper-content.animated.fadeIn > div.row > di")).click();
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']")).click();
		Thread.sleep(2000); // 1 second = 1000
	}

}