package Week13D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();


        WebElement firstName = driver.findElement(By.id("fullName"));
        firstName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.name("yourEmail"));
        email.sendKeys("john@doe123.com");

        WebElement clientName = driver.findElement(By.name("ClientName"));
        clientName.sendKeys("Syntax Technologies");

        WebElement idNumber = driver.findElement(By.id("ClientId"));
        idNumber.sendKeys("123-456-789");

        WebElement feedback = driver.findElement(By.name("Clientfeedback"));
        feedback.sendKeys("You're doing great in your journey as a QA Automation Engineer!");

        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Selenium - Locators");

        WebElement deadline = driver.findElement(By.name("ProjectTime"));
        deadline.sendKeys("April 10th 2025");

        WebElement currentAddress = driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("\"123 Main st, New York NY 54321\"");

        WebElement permanentAddress = driver.findElement(By.id("PermanentAddressId"));
        permanentAddress.sendKeys("\"221B Baker st, New York NY 12345\"");

        WebElement click = driver.findElement(By.linkText("Click Here."));
        click.click();

        WebElement button = driver.findElement(By.name("btn-submit"));
        button.click();

    }

}
