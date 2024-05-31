package SeleniumAssignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSel {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
