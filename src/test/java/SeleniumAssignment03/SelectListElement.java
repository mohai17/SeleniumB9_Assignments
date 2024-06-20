package SeleniumAssignment03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectListElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://demoqa.com/select-menu");
        webDriver.manage().window().maximize();

        WebElement webElement = webDriver.findElement(By.cssSelector("select[id=\"oldSelectMenu\"]"));

        Select select = new Select(webElement);
        select.selectByIndex(3);
        Thread.sleep(1000);

        select.selectByValue("4");
        Thread.sleep(1000);

        select.selectByVisibleText("Black");
        Thread.sleep(1000);

        List<WebElement> selectOptions = select.getOptions();

        for(WebElement option:selectOptions){
            System.out.println(option.getText());
        }


        webDriver.quit();


    }

}
