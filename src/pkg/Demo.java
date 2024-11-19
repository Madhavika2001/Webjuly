package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ChromeDriver
//edgedriver
		//firefoxdriver
		
		
		ChromeDriver driver=new ChromeDriver();  // to open chrome browser
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.quit();
		
	}

}
