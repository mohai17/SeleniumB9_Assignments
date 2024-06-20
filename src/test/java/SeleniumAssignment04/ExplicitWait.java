package SeleniumAssignment03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://demoqa.com/frames");
        webDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));

        Thread.sleep(2000);

        webDriver.switchTo().frame("frame1");
        WebElement textFrame1 = webDriver.findElement(By.cssSelector("h1[id='sampleHeading']"));
        wait.until(ExpectedConditions.visibilityOf(textFrame1));
        System.out.println("Text of frame 1: "+textFrame1.getText());
        webDriver.switchTo().defaultContent();

        Thread.sleep(2000);

        webDriver.switchTo().frame("frame2");
        WebElement textFrame2 = webDriver.findElement(By.cssSelector("h1[id='sampleHeading']"));
        wait.until(ExpectedConditions.visibilityOf(textFrame2));
        System.out.println("Text of frame 2: "+textFrame2.getText());
        webDriver.switchTo().defaultContent();

        Thread.sleep(2000);

        webDriver.quit();
    }

}
