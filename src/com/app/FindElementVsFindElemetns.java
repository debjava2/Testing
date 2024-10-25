package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElemetns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Workstation\\driver\\chromedriver-win64\\chromedriver.exe");
	System.out.println("Hiiiiiiiiiiiiii");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("q")).sendKeys("downloadhub");
}
}
