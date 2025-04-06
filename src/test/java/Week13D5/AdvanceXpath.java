package Week13D5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/advanceXpath-homework.php");
        driver.manage().window().maximize();


        WebElement leastFaveBook = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFaveBook.sendKeys("Stephen King - Charlie the Choo-Choo");

        WebElement leastFaveBook2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFaveBook2.sendKeys("Stephen King - Pet Sematary");

        WebElement leastFaveBook3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFaveBook3.sendKeys("Stephen King - In the Tall Grass");



        WebElement faveBook = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        faveBook.sendKeys("Stephen King - The Gunslinger");

        WebElement faveBook2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        faveBook2.sendKeys("Stephen King - The Waste Lands");

        WebElement faveBook3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        faveBook3.sendKeys("Stephen King - Wizard and Glass");



        WebElement grandParent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("Patrick J Kennedy");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Joseph P Kennedy");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("John F Kennedy");


    }

}
