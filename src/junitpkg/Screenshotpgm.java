package junitpkg;

import java.io.File;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshotpgm {

	ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }

    @Test
    public void fblogin() throws Exception
    {
    	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(s, new File("M://screenshot1.png"));
    }
}
