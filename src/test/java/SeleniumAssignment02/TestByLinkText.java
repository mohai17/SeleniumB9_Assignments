package SeleniumAssignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestByLinkText {
    public static void main(String[] args) throws InterruptedException{

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://parabank.parasoft.com");

        webDriver.getCurrentUrl();
        webDriver.getTitle();

        Thread.sleep(1000);

        webDriver.findElement(By.linkText("Register")).click();

        Thread.sleep(2000);

        webDriver.findElement(By.linkText("Forgot login info?")).click();

        Thread.sleep(1000);
        webDriver.quit();

    }
}
