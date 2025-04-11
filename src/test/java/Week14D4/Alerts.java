package Week14D4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
        driver.manage().window().maximize();


        //Task 1
        WebElement birthdayButton = driver.findElement(By.xpath("//button[@onClick='myAlertFunction()']"));
        birthdayButton.click();

        Alert alerts = driver.switchTo().alert();
        alerts.accept();


        //Task 2
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onClick='myConfirmFunction()']"));
        deleteButton.click();

        alerts.dismiss();

        WebElement text = driver.findElement(By.xpath("//p[text()='You pressed Cancel!']"));
        String message = text.getText();
        System.out.println(message);


        //Task 3
        WebElement enterYourName = driver.findElement(By.xpath("//button[@onClick='myPromptFunction()']"));
        enterYourName.click();

        alerts.sendKeys("B True");
        alerts.accept();

        WebElement name = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String output = name.getText();

        if(output.equals("You have entered 'B True' !")) {
            System.out.println(output);
        } else {
            System.out.println("Unexpected output... please try again.");
        }

    }

}
