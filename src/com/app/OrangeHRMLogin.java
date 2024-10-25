package com.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "D:\\Workstation\\driver\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the OrangeHRM login page
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Maximize the window
            driver.manage().window().maximize();

            // Locate the username field and enter the username
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("Admin");

            // Locate the password field and enter the password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("admin123");

            // Locate the login button and click it
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // Optionally, you can add a wait here to ensure the login is processed
            Thread.sleep(3000); // Wait for 3 seconds

            // Verify successful login by checking the URL or an element on the homepage
            if (driver.getCurrentUrl().contains("/web/index.php/dashboard/index")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the driver
            driver.quit();
        }
    }
}
