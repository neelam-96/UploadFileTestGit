package Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RobotClassUploadFile {

    @Test
   public void logoTest() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Lunch Chrome

        driver.get("https://www.monsterindia.com/seeker/registration");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));



       Robot robot = new Robot();


        Thread.sleep(2000);

        StringSelection str = new StringSelection("C:\\Users\\ramesh\\Desktop\\resume@.doc");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);


       robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("file uploaded");

    }

}
