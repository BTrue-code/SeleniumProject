package Week14D1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/basic-checkbox-demo-homework.php");
        driver.manage().window().maximize();


        //Task 1
        WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        newsletter.click();


        //Task 2
        List<WebElement> hobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));

        for(WebElement result : hobbies) {
            if(result.getAttribute("value").equals("reading") || result.getAttribute("value").equals("cooking")) {
                result.click();
            }
        }


        //Task 3
        WebElement showCheckBoxes = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        showCheckBoxes.click();

        List<WebElement> musicButton = driver.findElements(By.xpath("//div[@class='interest_section']/div/label/input"));

        for(WebElement button : musicButton) {
            if(button.getAttribute("value").equals("Music")) {
                Thread.sleep(2000);
                boolean results = button.isDisplayed();
                System.out.println("Is the Music checkbox displayed? " + results);
                button.click();
            }
        }


        //Task 4
        WebElement enableCheckBoxes = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckBoxes.click();

        WebElement notifications = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        notifications.click();

        List<WebElement> preference = driver.findElements(By.xpath("//div[@class='checkbox']/label//input[@disabled='disabled']"));

        for(WebElement text : preference) {
            if(text.getAttribute("value").equals("Receive-Notifications")) {
                text.click();
            }
        }


    }

}
