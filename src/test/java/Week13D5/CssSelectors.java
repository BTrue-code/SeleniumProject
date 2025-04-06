package Week13D5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/cssSelector-homework.php");
        driver.manage().window().maximize();


        WebElement userId = driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("BTrueCode");

        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("B True");

        WebElement course = driver.findElement(By.cssSelector("input[name*='LectureIntro']"));
        course.sendKeys("Selenium Course");

        WebElement feedback1 = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedback1.sendKeys("Ray is learning Java, and doing a good job!");

        WebElement feedback2 = driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        feedback2.sendKeys("Ducky is learning Selenium, and doing a good job!");

        WebElement clientId = driver.findElement(By.cssSelector("input[name*='ClientID']"));
        clientId.sendKeys("123ID");

        WebElement email = driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("Syntax@Technologies.com");

        WebElement topic = driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        topic.sendKeys("QA Automation Course");





    }

}
