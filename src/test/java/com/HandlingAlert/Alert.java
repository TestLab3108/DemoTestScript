package com.HandlingAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "Sufiyan Attar";

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/DriverUpdated/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(name);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@onclick='displayAlert()']")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		// input[@value='Confirm']
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
