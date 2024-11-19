package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfacebook {
	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

    @Test
    public void fblogin() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abc@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123r3ef");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }
}

