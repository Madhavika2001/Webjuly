package testngpkg;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileuploadrobot {
    ChromeDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void fileuploadpgm() throws Exception {
        driver.get("https://www.ilovepdf.com/word_to_pdf");
        driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();

        fileUpload("\"C:\\Users\\iamma\\Downloads\\INTRODUCTION JAVA (1).docx\"");
    }

    public void fileUpload(String p) throws AWTException {
        StringSelection strSelection = new StringSelection(p);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);

        Robot robot = new Robot();
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    
}

