package SeleniumAssignment03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();

        webDriver.navigate().to("https://demoqa.com");

        Thread.sleep(1000);

        webDriver.navigate().back();

        Thread.sleep(1000);

        webDriver.navigate().forward();

        Thread.sleep(1000);

        webDriver.navigate().refresh();

        webDriver.quit();

    }

}
