package SeleniumAssignment03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://demoqa.com/frames");
        webDriver.manage().window().maximize();

        Thread.sleep(2000);

        webDriver.switchTo().frame("frame1");
        String textFrame1 = webDriver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText();
        System.out.println("Text of frame 1: "+textFrame1);
        webDriver.switchTo().defaultContent();

        Thread.sleep(2000);

        webDriver.switchTo().frame("frame2");
        String textFrame2 = webDriver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText();
        System.out.println("Text of frame 2: "+textFrame2);
        webDriver.switchTo().defaultContent();

        Thread.sleep(2000);

        webDriver.quit();

    }
}
