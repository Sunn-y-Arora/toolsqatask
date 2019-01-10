package task;
/*
Launch new Browser
Open “http://toolsqa.com/automation-practice-form/“
Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TaskFour {

    public void performTask(){

        System.setProperty("webdriver.chrome.driver","/Users/sunnyarora/qatoolstask/Webdrivers/chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("http://toolsqa.com/automation-practice-form/");

        List<WebElement> elements= driver.findElements(By.name("sex"));

        if( elements.get(0).isSelected() == true){
            elements.get(1).click();
        }
        else{
            elements.get(0).click();
        }

         driver.findElement(By.id("exp-2")).click();

        List<WebElement> Professions=driver.findElements(By.name("profession"));

        for(int i=0; i< Professions.size(); i++){

            if(Professions.get(i).getAttribute("value").equalsIgnoreCase("Automation Tester"))
            {
                Professions.get(i).click();
                break;
            }
        }

        driver.findElement(By.cssSelector("#tool-1"));



    }
}
