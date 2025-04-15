package Week15D1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class StaticTables {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/table-search-filter-demo-homework.php");
        driver.manage().window().maximize();


        //Task 1
        List<WebElement> country = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        int count = 1;
        for (WebElement list : country) {
            String text = list.getText();

            if(text.equals("Australia")) { //Can Change the Country Name and still get requested results
                WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]"));
                System.out.println(row.getText());
            }
            count++;
        }
        System.out.println();


    }

}
