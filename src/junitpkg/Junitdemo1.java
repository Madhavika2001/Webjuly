package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo1 {
	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login");
    }

    @Test
    public void linkedInLogin() {
        driver.findElement(By.id("username")).sendKeys("your-email@example.com");
        driver.findElement(By.id("password")).sendKeys("your-password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

