package Week15D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class DynamicTables {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/logi");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //Task 1
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        WebElement page3 = driver.findElement(By.xpath("(//a[text()='3'])[1]"));
        page3.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr[44]/td[1]")));

        WebElement button = driver.findElement(By.xpath("//table/tbody/tr[44]/td[1]"));
        button.click();


        //Task 2
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean notFound = true;

        while(notFound) {
        int count = 1;
            for (WebElement ids : allIDs) {
                String result = ids.getText();

                if (result.equals("116620A")) {
                    System.out.println(count);
                    WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]"));
                    checkBox.click();
                    notFound = false;
                    break;
                }
                count = count + 1;
            }
            if(notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextBtn.click();
                allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }
    }
}

