package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrcpgm {
	static String baseurl="https://www.bing.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if (src.contains("Bing")) {
		    System.out.println("The page contains the word Bing");
		} else {
		    System.out.println("The page does not contain the word Bing");
		}
		
			}

		
	}


