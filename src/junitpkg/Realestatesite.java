package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Realestatesite {
	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.keralaproperty.in/member/login/");
    }

    @Test
    public void keralaPropertyLogin() {
        driver.findElement(By.name("ulogin")).sendKeys("H547dgd6");
        driver.findElement(By.id("upass")).sendKeys("madsg@th34");
        driver.findElement(By.id("sub_logbtn")).click();
    }
}

