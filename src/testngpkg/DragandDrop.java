package testngpkg;


    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class DragandDrop {
	    ChromeDriver driver;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/drag_drop.html");
	    }

	    @Test
	    public void testDragAndDrop() {
	    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	        Actions act = new Actions(driver);
	       
	        WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	        WebElement debitAccount = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	        WebElement amountDebit = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	        WebElement debitAmount = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	        WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	        WebElement creditAccount = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	        WebElement amountCredit = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	        WebElement creditAmount = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));

	        act.dragAndDrop(bank, debitAccount).perform();
	        act.dragAndDrop(amountDebit, debitAmount).perform();
	        act.dragAndDrop(sales, creditAccount).perform();
	        act.dragAndDrop(amountCredit, creditAmount).perform();
	        
	        WebElement button= driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	        if(button.isDisplayed())
	        {
	        	System.out.println("the Button is Displayed");
	        }
	        else
	        {
	        	System.out.println("The Button is  Not Displayed");
	        }
	    }
}
