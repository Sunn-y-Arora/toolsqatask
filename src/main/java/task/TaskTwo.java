package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

    public void performTask(){


        System.setProperty("webdriver.chrome.driver","/Users/sunnyarora/qatoolstask/Webdrivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.razorpay.com");

        driver.findElement(By.cssSelector("#nav > div.container > ul > div.right > a")).click();

        driver.close();
    }
}
