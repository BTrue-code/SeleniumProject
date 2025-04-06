package Week13D7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        driver.manage().window().maximize();


        WebElement text = driver.findElement(By.xpath("//div[@id='textattr']"));
        String textValue = text.getText();
        System.out.println(textValue);


        WebElement radioButton1 = driver.findElement(By.xpath("//input[@name='MealRadio']"));
        boolean press1 = radioButton1.isEnabled();
        System.out.println("Enabled? " + press1);
        radioButton1.click();


        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean press2 = radioButton2.isEnabled();
        System.out.println("Enabled? " + press2);


        WebElement button = driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        button.click();
        WebElement radioButton3 = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        radioButton3.click();


        WebElement attribute = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String attributeValue = attribute.getAttribute("title");
        System.out.println(attributeValue);


        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='CheckboxFirst']"));
        boolean checked1 = checkBox1.isEnabled();
        System.out.println(checked1);
        checkBox1.click();


        WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
        boolean checked2 = checkBox2.isEnabled();
        System.out.println(checked2);


        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");

    }

}
