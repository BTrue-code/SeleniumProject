package Week14D1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        driver.manage().window().maximize();

        //Task 1
        WebElement juiceButton = driver.findElement(By.xpath("//input[@value='Juice']"));
        juiceButton.click();


        //Task 2
        List<WebElement> workingEnviroment = driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for(WebElement all : workingEnviroment) {
            if(all.getAttribute("value").equals("hybrid")){
                all.click();
            }
        }


        //Task 3
        WebElement enabledButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        enabledButton.click();

        WebElement springButton = driver.findElement(By.xpath("//input[@value='spring']"));
        boolean results = springButton.isSelected();
        System.out.println("Is the Spring Button selected? " + results);
        springButton.click();

        WebElement winterButton = driver.findElement(By.xpath("//input[@value='winter']"));
        boolean result = winterButton.isDisplayed();
        System.out.println("Is the Winter button displayed? " + result);
        WebElement showButton = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        showButton.click();
        winterButton.click();
        boolean afterResult = winterButton.isDisplayed();
        System.out.println("Is the Winter button displayed? " +afterResult);


        //Task 4
        WebElement lunch = driver.findElement(By.xpath("//input[@value='lunch']"));
        lunch.click();

    }

}
