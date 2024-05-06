package com.alldropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class com_StaticDropDown {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/DriverUpdated/chromedriver-win64/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//How to handle Static dropdown
		
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticdropdown);
		//dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		//While loop for selecting the Adults in Spice jet
		
//		int=1;
//		while(i=1)
//	
//		{
//			driver.findElement(By.xpath(null)).click();
//		    i++;
//			
//		}
		
//		for(i=1;i<5;i++)
//		{
//			driver.findElement(By.xpath(null)).click();
////		    i++;
//		}
		
	    
		
		
		
		
		

	}

}
