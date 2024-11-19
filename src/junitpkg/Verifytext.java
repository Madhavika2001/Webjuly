package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytext {
	ChromeDriver driver;
	@Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
	@Test
	public void verify()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		System.out.println(buttontext);
		if(buttontext.equals("Check availability"))
				{
			System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
	}
}
