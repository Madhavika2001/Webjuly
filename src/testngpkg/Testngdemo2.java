package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo2 {
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		System.out.println("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@BeforeMethod
	public void mthd()
	{
		System.out.println("url loading");
	}
	@Test(priority = 2)
	public void verifyfullname() {
		System.out.println("test1");
	}



