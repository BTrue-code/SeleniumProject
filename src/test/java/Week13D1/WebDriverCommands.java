package Week13D1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
        String title1 = driver.getTitle();
        System.out.println(title1);

        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2 = driver.getTitle();
        System.out.println(title2);

        driver.navigate().back();

        driver.navigate().refresh();

        driver.close();
    }

}
