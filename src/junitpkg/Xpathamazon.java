package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon
{
	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }
    
    @Test
    public void amazon()
    {
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
    	driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span[1]")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();
    }

}



