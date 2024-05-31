package SeleniumAssignment03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAndTabTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.saucedemo.com");
        Thread.sleep(2000);

        String originalWindow = webDriver.getWindowHandle();

        webDriver.switchTo().newWindow(WindowType.WINDOW);
        webDriver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
        webDriver.findElement(By.id("tnb-google-search-input")).sendKeys("Java Tutorial");
        Thread.sleep(3000);
        webDriver.findElement(By.id("tnb-google-search-submit-btn")).click();
        Thread.sleep(3000);
        webDriver.close();
        webDriver.switchTo().window(originalWindow);

        Thread.sleep(3000);

        webDriver.switchTo().newWindow(WindowType.TAB);
        webDriver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        webDriver.findElement(By.id("email")).sendKeys("example@email.com");
        Thread.sleep(3000);
        webDriver.findElement(By.id("pass")).sendKeys("example123");
        Thread.sleep(3000);
        webDriver.findElement(By.name("login")).click();
        Thread.sleep(6000);
        webDriver.close();
        webDriver.switchTo().window(originalWindow);

        Thread.sleep(2000);
        webDriver.quit();

    }
}
