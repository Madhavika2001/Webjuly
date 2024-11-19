package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass
{
	WebDriver driver;

@Test
public void createpagetest()
{
	Fbcreatepage ob1=new Fbcreatepage(driver);
	ob1.process();
}
}