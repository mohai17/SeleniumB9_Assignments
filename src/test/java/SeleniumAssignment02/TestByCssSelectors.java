package SeleniumAssignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestByCssSelectors {
    public static void main(String[] args) throws InterruptedException{

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.saucedemo.com");

        Thread.sleep(1000);

        webDriver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("error_user");
        webDriver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");

        Thread.sleep(2000);

        webDriver.findElement(By.cssSelector("input[data-test=\"login-button\"]")).click();

        Thread.sleep(2000);

        webDriver.quit();

    }
}
