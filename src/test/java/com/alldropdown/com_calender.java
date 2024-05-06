package com.alldropdown;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_calender {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/DriverUpdated/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gurumavin.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		//
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

		driver.findElement(By.xpath(
				"//div[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-t1nuxs'][normalize-space()='I am aTeacher']"))
				.click();

		driver.findElement(By.id("email")).sendKeys("yusufkhangmt@gmail.com");

		driver.findElement(By.id("password")).sendKeys("GMactive@123");

		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		// jse.executeScript("window.scrollBy(-4000,0)");

		driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-fiov70']//button[@type='button']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//h1[normalize-space()='Personal Profile']//*[name()='svg']")).click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date
		// is Jan 14, 2024']")).click();

	}
}
