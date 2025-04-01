package Week13D1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBroswer {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.syntaxprojects.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url);
        System.out.println(title);

        driver.close();
    }

}
