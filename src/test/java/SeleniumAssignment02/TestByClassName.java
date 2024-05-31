package SeleniumAssignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestByClassName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.saucedemo.com");

        String currentURL = webDriver.getCurrentUrl();
        String title = webDriver.getTitle();

        Thread.sleep(1000);

        webDriver.findElement(By.id("user-name")).sendKeys("error_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(2000);
        webDriver.findElement(By.className("submit-button")).click();

        Thread.sleep(1000);
        webDriver.quit();

    }
}
