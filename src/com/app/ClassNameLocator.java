package com.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Workstation\\driver\\chromedriver-win64\\chromedriver.exe");
	System.out.println("Hiiiiiiiiiiiiii");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	List<WebElement> list=driver.findElements(By.className("inputtext"));
	System.out.println(list.size());
	
	list.get(0).sendKeys("Debashsish");
	list.get(1).sendKeys("ddekkkd;a;ad;;");
	
}
}
