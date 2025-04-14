package Week14D7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        //Task 1
        WebElement btn = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        btn.click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));

        WebElement text = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text.getText());


        //Task 2
        WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement pushBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        pushBtn.click();


        //Task 3
        WebElement checkBox = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBox.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement select = driver.findElement(By.xpath("//input[@id='checkbox']"));
        boolean hasBeenSelect = select.isSelected();
        System.out.println(hasBeenSelect);

    }

}
