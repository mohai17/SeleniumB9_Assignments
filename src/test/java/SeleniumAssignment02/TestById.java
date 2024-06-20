package SeleniumAssignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestById {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.saucedemo.com");
        webDriver.manage().window().maximize();

        webDriver.findElement(By.id("user-name")).sendKeys("error_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();


        String currentUrl = webDriver.getCurrentUrl();
        String currentTitle = webDriver.getTitle();

        System.out.println("\n--------------------------");
        System.out.println("Current Title: "+currentTitle);
        System.out.println("Current URL: "+currentUrl);

        Thread.sleep(5000);

        webDriver.quit();
    }
}
