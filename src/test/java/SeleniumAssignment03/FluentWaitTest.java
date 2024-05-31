package SeleniumAssignment03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://demoqa.com/alerts");
        webDriver.manage().window().maximize();
        Wait<WebDriver> wait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(30));
        new FluentWait<>(webDriver).pollingEvery(Duration.ofSeconds(5));
        new FluentWait<>(webDriver).ignoring(NoSuchFieldError.class);

        webDriver.findElement(By.id("alertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();

        webDriver.findElement(By.id("confirmButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();

        webDriver.findElement(By.id("promtButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());

        Thread.sleep(3000);
        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys("Mohai Minul");
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);
        webDriver.quit();

    }
}
