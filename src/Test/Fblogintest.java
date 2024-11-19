package Test;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;

import Page.Fbloginpage;
public class Fblogintest extends Baseclass
	{
		WebDriver driver;
	@Test
	public void setUp()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("wy@gmail.com", "mt123");
		ob.login();
	}
	}
