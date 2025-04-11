package Week14D4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.manage().window().maximize();


        //Switch to Iframe
        driver.switchTo().frame(0);

        //Task 3
        WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("B True");


        //Switch to Content
        driver.switchTo().defaultContent();

        //Switch to Iframe
        driver.switchTo().frame("dropdownIframe");

        //Task 2
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='cities']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Chicago");


        //Switch to Content
        driver.switchTo().defaultContent();

        //Switch to Iframe
        driver.switchTo().frame("dropdownIframe");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(iframe);

        //Task 1
        WebElement age = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        age.click();

    }

}
