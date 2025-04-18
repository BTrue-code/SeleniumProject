package Week15D4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class CalendarWithNavigation {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.manage().window().maximize();


        driver.findElement(By.id("from_date")).click();


        WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
        String currentMonth = month.getText();
        String currentYear = year.getText();
        boolean notFound = true;


        while(notFound) {
            if (currentMonth.equals("December") && currentYear.equals("2026")) {
                    List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

                    for (WebElement date : dates) {

                        if (date.getText().equals("2")) {
                            date.click();
                        }
                    }
                    notFound = false;
                } else {
                    WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                    nextBtn.click();
                    month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
                    currentMonth = month.getText();
                    year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
                    currentYear = year.getText();
                }


        }
        driver.findElement(By.id("to_date")).click();

        WebElement month1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        WebElement year1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
        String currentMonth1 = month1.getText();
        String currentYear1 = year1.getText();
        boolean notFound1 = true;


        while(notFound1) {

            if (currentMonth1.equals("August") && currentYear1.equals("2025") ) {
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

                for (WebElement date : dates) {

                    if(date.getText().equals("17")) {
                        date.click();
                    }
                }
                notFound1 = false;
            }else {
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
                month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
                currentMonth1 = month.getText();
                year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
                currentYear1 = year.getText();

            }

        }

    }

}
