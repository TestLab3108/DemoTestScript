package com.Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase_1 {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Drivers/DriverUpdated/chromedriver-win64/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
    driver.get("https://gurumavin.in/educator-account");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.id("email")).sendKeys("educator@educator.com");
    driver.findElement(By.id("password")).sendKeys("educatorpassword");
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@value='remember']")).click();
    
    Assert.assertTrue(driver.findElement(By.xpath("//input[@value='remember']")).isSelected());
    
    driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
    
    
    //Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
    
    //System.out.println(driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText());
    
    Assert.assertEquals( driver.findElement(By.xpath("  //*[@id=\"notistack-snackbar\"]")).getText(), "Signin Success.");
    
    driver.getCurrentUrl();
    
    Assert.assertEquals("https://gurumavin.in/", driver.getCurrentUrl());
    
     System.out.println( driver.getCurrentUrl());
   
    // Assert.assertEquals("https://gurumavin.in/", driver.getCurrentUrl());
    
    //*[@id="notistack-snackbar"]

     }
}
