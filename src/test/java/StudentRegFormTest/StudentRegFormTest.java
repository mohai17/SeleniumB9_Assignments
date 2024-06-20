package StudentRegFormTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.io.File;

public class StudentRegFormTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://demoqa.com/automation-practice-form");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(3000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("firstName"))).click().sendKeys("Mohai").perform();
        Thread.sleep(2000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("lastName"))).click().sendKeys("Minul").perform();
        Thread.sleep(2000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("userEmail"))).click().sendKeys("minul@email.com").perform();
        Thread.sleep(2000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.cssSelector("input[id='gender-radio-1']"))).click().perform();
        Thread.sleep(2000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.cssSelector("input[id='userNumber']"))).click().sendKeys("01234556678").perform();
        Thread.sleep(2000);

        webDriver.findElement(By.cssSelector("input[id='dateOfBirthInput']")).click();

        Select select = new Select(webDriver.findElement(By.cssSelector("select[class='react-datepicker__month-select']")));
        select.selectByValue("4");

        Thread.sleep(2000);

        Select select1 = new Select(webDriver.findElement(By.cssSelector("select[class=\"react-datepicker__year-select\"]")));
        select1.selectByValue("1999");

        webDriver.findElement(By.className("react-datepicker__day--017")).click();
        Thread.sleep(2000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("subjectsInput"))).click().sendKeys(Keys.CONTROL).sendKeys("c").perform();
        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("react-select-2-option-2"))).click().perform();
        Thread.sleep(2000);

        webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
        Thread.sleep(2000);

        File uploadFile = new File("src/test/resources/photo1.jpg");
        WebElement webElement = webDriver.findElement(By.id("uploadPicture"));
        webElement.sendKeys(uploadFile.getAbsolutePath());

        webDriver.findElement(By.id("currentAddress")).sendKeys("Rajshahi");

        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("react-select-3-input"))).click().perform();
        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("react-select-3-option-3"))).click().perform();
        Thread.sleep(3000);

        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("react-select-4-input"))).click().perform();
        new Actions(webDriver).moveToElement(webDriver.findElement(By.id("react-select-4-option-0"))).click().perform();

        webDriver.findElement(By.cssSelector("button[id='submit']")).click();
        webDriver.findElement(By.cssSelector("button[id='closeLargeModal']")).click();

        Thread.sleep(3000);

        webDriver.quit();

    }
}
