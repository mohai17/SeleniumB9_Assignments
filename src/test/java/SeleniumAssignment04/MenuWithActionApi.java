package SeleniumAssignment04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MenuWithActionApi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("https://demoqa.com/menu");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        new Actions(webDriver).scrollByAmount(200,300).perform();

        new Actions(webDriver).moveToElement(webDriver.findElement(By.linkText("Main Item 2"))).click().perform();
        Thread.sleep(3000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.linkText("SUB SUB LIST »"))).click().perform();
        Thread.sleep(3000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.linkText("Sub Sub Item 2"))).click().perform();
        Thread.sleep(3000);

        webDriver.quit();

    }
}
