package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Workstation\\driver\\chromedriver-win64\\chromedriver.exe");
	System.out.println("Hiiiiiiiiiiiiii");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com");
	  driver.manage().window().maximize();
	driver.
	findElement(By.cssSelector("#Form_submitForm_EmailHomePage")).sendKeys("Admin@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("#Form_submitForm_action_request")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#Form_getForm_subdomain")).sendKeys("Debashish");
	driver.findElement(By.cssSelector("#Form_getForm_Name")).sendKeys("Debashish Mahato");
	driver.findElement(By.cssSelector("input[type='text'][name='Contact']")).sendKeys("9832299676");
	//Conatins :input[type*='wor']
	//Start with:input[type^='pass']
	//Ends with :input[type$='word']
	
	
	//ClaName Locator
	
	
	 	
	//driver.findElement(By.cssSelector("#input[type='password']")).sendKeys("Admin")	
	//driver.findElement(By.cssSelector("#input.button")).click();
	//css sentects using tag name class name ,name
	//driver.findElement(By.cssSelector("input#btnLogin.button[name='Submit']")).click();
	
	//input[@id='Form_getForm_subdomain']
	
	//Form_getForm_Name
	
}
}
