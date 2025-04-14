package Week14D7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ImplicitWait {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Task
        WebElement btn = driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        btn.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement option : checkBoxes) {
            if(option.getAttribute("value").equals("Option-1")) {
                option.click();
            }
        }


    }


}
