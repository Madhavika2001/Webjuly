package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabsxpath {
	ChromeDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
    }

@Test
public void Swaglabsxpath() {
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
    driver.findElement(By.xpath("//input[@name='login-button']")).click();
    driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
    driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[1]")).click();
    driver.findElement(By.xpath("//button[@id='checkout']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Maya");
    driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("Das");
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("6568");
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    driver.findElement(By.xpath("//button[@id='finish']")).click();





    
    
}
}