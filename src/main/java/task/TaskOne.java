/*Launch a new browser.
        Open Store.DemoQA.com
        Get Page Title name and Title length
        Print Page Title and Title length on the Eclipse Console.
        Get Page URL and verify if the it is a correct page opened
        Get Page Source (HTML Source code) and Page Source length
        Print Page Length on Eclipse Console.
        Close the Browser.
        */


package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

    public void performTask(){


        System.setProperty("webdriver.chrome.driver","/Users/sunnyarora/qatoolstask/Webdrivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        String url="http://www.razorpay.com";

        driver.get(url);

        String title= driver.getTitle();

        System.out.println("Title is"+title+"  and length is "+ title.length());

        String actualurl=driver.getCurrentUrl();

        if(url.equals(actualurl)==true){
            System.out.println("Correct page is open");

            String pageSource=driver.getPageSource();
            System.out.println("Page source length is "+pageSource.length());

        }
        else {
               System.out.println("Correct page is open");
        }

        driver.close();
    }
}
