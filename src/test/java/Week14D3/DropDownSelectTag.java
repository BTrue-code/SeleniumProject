package Week14D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownSelectTag {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        driver.manage().window().maximize();


        //SINGLE SELECT
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        dropDown.click();
        Select select = new Select(dropDown);
        select.selectByValue("Pear");

        List<WebElement> allOptions = select.getOptions();

        for (WebElement opts : allOptions) {
            System.out.println(opts.getText());
        }


        //MULTIPLE SELECT
        WebElement multiDrpDown = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel = new Select(multiDrpDown);
        boolean result = sel.isMultiple();
        System.out.println("Is the drop down multi select? " + result);

        sel.selectByIndex(1);
        sel.selectByValue("Cooking");
        sel.selectByVisibleText("Gardening");

        List<WebElement> all = sel.getAllSelectedOptions();

        for(WebElement selected : all) {
            String text = selected.getText();
            System.out.println(text);
        }
        Thread.sleep(5000);

        sel.deselectByIndex(1);

        List<WebElement> selectedAll = sel.getAllSelectedOptions();

        for(WebElement selected : selectedAll) {
            String text = selected.getText();
            System.out.println(text);
        }

    }

}
