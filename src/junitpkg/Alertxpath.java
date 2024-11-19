package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertxpath {
	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/iamma/OneDrive/Desktop/alert.html");
    }
    @Test
    public void alert() {
    	driver.findElement(By.xpath("//input[@type='button']")).click();
    	Alert a=driver.switchTo().alert();     
    	String text=a.getText();
    	System.out.println("alert text="+text);
    	a.accept();
    	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Meenu");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
