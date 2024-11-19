package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

    @Test
    public void fblogin() {
        driver.findElement(By.id("email")).sendKeys("Abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123r3ef");
        driver.findElement(By.name("login")).click();
    }
}

