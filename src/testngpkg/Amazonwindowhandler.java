package testngpkg;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazonwindowhandler {
	ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }
    
    @Test
    public void test()
    {
    	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
    	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(windowdetails.get(1));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
    	
    }
}

