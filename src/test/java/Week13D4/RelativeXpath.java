package Week13D4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.syntaxprojects.com/Xpath-homework.php");
        driver.manage().window().maximize();

        //Hobbies
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Code.., Eat.., Sleep.., Repeat");

        //Button (click)
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        //Favorite Movie
        WebElement faveMovie = driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
        faveMovie.sendKeys("INVASION OF THE BODY SNATCHERS");

        //Text paragraph
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'Doloribus distinctio, dolorum aspernatur')]"));
        System.out.println(text);

        //City
        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Miami, FL");

        //Email (1)
        WebElement email1 = driver.findElement(By.xpath("(//input[@type='email' and @class='form-control'])[1]"));
        email1.sendKeys("personal@email.com");

        //Email(2)
        WebElement email2 = driver.findElement(By.xpath("(//input[@type='email' and @class='form-control'])[2]"));
        email2.sendKeys("office@email.com");

        //Email(3)
        WebElement email3 = driver.findElement(By.xpath("(//input[@type='email' and @class='form-control'])[3]"));
        email3.sendKeys("professional@email.com");

        //Client Name/ Client ID
        WebElement clientName = driver.findElement(By.xpath("//input[@id='clientName' and @data-detail='one']"));
        clientName.sendKeys("Syntax Technologies");

        WebElement clientId = driver.findElement(By.xpath("//input[@id='clientId' and @data-detail='two']"));
        clientId.sendKeys("642135");

        //Use xpath of your choice... Street Number/ House Number
        WebElement streetNumber = driver.findElement(By.xpath("//input[@name='StreetNo' and @data-detail='one']"));
        streetNumber.sendKeys("6th Street");

        WebElement houseNumber = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("221B");


    }

}
