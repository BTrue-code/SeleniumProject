package Week14D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownNoSelectTag {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
        driver.manage().window().maximize();


        WebElement click = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        click.click();

        //Task 1
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'single-dropdown-menu')]/li"));

        for(WebElement choice : options) {
            String text = choice.getText();

            if(text.equals("Mango")) {
                choice.click();
            }
        }


        //Task 2
        WebElement clicks = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        clicks.click();

        List<WebElement> opts = driver.findElements(By.xpath("//ul[contains(@class,'multi-dropdown-menu')]/li"));

        for(WebElement selection : opts) {
            String txt = selection.getText();

            if(txt.equals("Reading")) {
                selection.click();
            }
        }
    }

}
