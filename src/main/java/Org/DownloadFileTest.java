package Org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFileTest {


    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Lunch Chrome


        driver.get("http://demo.automationtesting.in/FileDownload.html");//enter URL
        driver.manage().window().maximize();//Maximize
        Thread.sleep(2000);

        //Download text file


        driver.findElement(By.id("textbox")).sendKeys("DEMO TESTING");// genrate button

        driver.findElement(By.id("createTxt")).click();//
        Thread.sleep(2000);
        driver.findElement(By.id("link-to-download")).click();//click on download link
    }
}
