package SeleniumAssignment03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://demoqa.com/alerts");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        webDriver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();

        webDriver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();

        webDriver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        webDriver.switchTo().alert().dismiss();

        webDriver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys("Mohai Minul");
        Thread.sleep(2000);
        alert.accept();


        Thread.sleep(2000);
        webDriver.quit();

    }
}
