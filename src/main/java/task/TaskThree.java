/*

Practice Exercise
Launch new Browser
Open DemoQA.com website
Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
Come back to Home page (Use ‘Back’ command)
Again go back to Registration page (This time use ‘Forward’ command)
Again come back to Home page (This time use ‘To’ command)
Refresh the Browser (Use ‘Refresh’ command)
Close the Browser

*/
package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {

    public void performTask(){
        System.setProperty("webdriver.chrome.driver","/Users/sunnyarora/qatoolstask/Webdrivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.razorpay.com");

        driver.findElement(By.cssSelector("#nav > div.container > ul > div.right > a")).click();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().to("https://www.razorpay.com");

        driver.navigate().refresh();

        driver.close();

    }
}
