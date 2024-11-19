package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement Fbcreatepage;
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void process() 
	{
	String src=driver.getPageSource();
	if(src.contains("Create a Page"))
	{
		System.out.println("It contains");
	}
	else
	{
		System.out.println("It doesn't contains");
	}
}
}
