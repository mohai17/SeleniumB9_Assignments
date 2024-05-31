package SeleniumAssignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestByName {
    public static void main(String[] args) throws InterruptedException{

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.saucedemo.com");

        webDriver.getCurrentUrl();
        webDriver.getTitle();

        Thread.sleep(1000);

        webDriver.findElement(By.name("user-name")).sendKeys("error_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");

        Thread.sleep(1000);

        webDriver.findElement(By.name("login-button")).click();

        Thread.sleep(1000);

        webDriver.quit();


    }
}
