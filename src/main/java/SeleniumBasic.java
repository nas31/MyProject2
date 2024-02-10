import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasic {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/");
        driver.get("https://www.duotech.io/");
       String currentURL = driver.getCurrentUrl();
       String title = driver.getTitle();

        System.out.println(currentURL);
        System.out.println(title);
        System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("Selenium automates browsers.That's it!")){
            System.out.println("Test Passed");
        } else{
            System.out.println("Test field");

        }

       // driver.quit(); // quits all open tabs and ends the browsers session
        driver.close(); // only closes the currently active tab

        driver.navigate().to("https://www.duotech.io/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();




    }
}
