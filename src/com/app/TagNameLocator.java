package com.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workstation\\driver\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Hiiiiiiiiiiiiii");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());

		list.forEach(a->{
			System.out.println(a.getText());
		});
	}
}
