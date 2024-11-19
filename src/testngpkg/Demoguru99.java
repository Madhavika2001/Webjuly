package testngpkg;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Demoguru99 {
		ChromeDriver driver;

	    @BeforeTest
	    public void setUp()
	    {
	        driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    }
	    @Test
	    public void Test() throws Exception
	    {
	    	WebElement clickElement = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	        Actions actions = new Actions(driver);
	        actions.contextClick(clickElement).perform();
	       driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	        driver.switchTo().alert().accept();
	        WebElement d = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	        actions.doubleClick(d);
	        actions.perform();
	        Thread.sleep(3000);
	        Alert a=driver.switchTo().alert();
	        System.out.println("Alert text" + a.getText());
	        a.accept();
	    }

	}

