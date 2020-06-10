package Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {


    @Test
   public void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Lunch Chrome

        driver.get("https://www.monsterindia.com/seeker/registration");
        WebElement file = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));

        file.sendKeys("C:\\Users\\ramesh\\Desktop\\resume@.doc");


              // sendKeys("C:\\Users\\ramesh\\Desktop\\resume@.doc");


    }

}
