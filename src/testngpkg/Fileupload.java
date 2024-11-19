package testngpkg;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

    ChromeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
    }

    @Test
    public void test() {
        driver.findElement(By.xpath("//*[@id='uploadfile_0']")).sendKeys("C:\\Users\\iamma\\OneDrive\\Pictures\\Saved Pictures\\nakagin-capsule-tower-tokyo-japan-architecture-news-dezeen-wiki-kakidai-col-2.jpg");
        driver.findElement(By.xpath("//*[@type='checkbox']")).click();
        driver.findElement(By.xpath("//*[@id='submitbutton']")).click();

        String text = driver.findElement(By.xpath("//*[@id='res']/center")).getText();

        if (text.equalsIgnoreCase("has been successfully uploaded")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}


