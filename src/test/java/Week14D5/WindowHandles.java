package Week14D5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
        driver.manage().window().maximize();


        //Task 1
        //Get the window handle of the main page
        String mainPage = driver.getWindowHandle();

        WebElement b1Btn = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        b1Btn.click();
        boolean button1 = b1Btn.isDisplayed();
        System.out.println("B1 page window is being displayed " + button1);



        //Task 2
        //Switch to Window Main Page
        driver.switchTo().window(mainPage);

        WebElement b2Btn = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        b2Btn.click();
        boolean button2 = b2Btn.isDisplayed();
        System.out.println("B2 page window is being displayed " + button2);
        String b2 = driver.getWindowHandle();


        //Switch to Window Main Page
        //Print text from all open Windows
        driver.switchTo().window(mainPage);

        Set<String> allHandles = driver.getWindowHandles();

        for(String handle : allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();

           if(url.equals("https://syntaxprojects.com/b1-page.php")) {
                WebElement b1Page = driver.findElement(By.xpath("//h2"));
                String text1 = b1Page.getText();
                System.out.println("B1 Page text: " + text1);
            }

            if(url.equals("https://syntaxprojects.com/b2-page.php")) {
                WebElement b2Page = driver.findElement(By.xpath("//h2"));
                String text2 = b2Page.getText();
                System.out.println("B2 Page text: " + text2);
            }


        }

    }
}