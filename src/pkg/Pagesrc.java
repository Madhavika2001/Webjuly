package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {
static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get(baseurl);
String src=driver.getPageSource();
if (src.contains("Google")) {
    System.out.println("The page contains the word 'Google'.");
} else {
    System.out.println("The page does not contain the word 'Google'.");
}
driver.quit();
	}

}
