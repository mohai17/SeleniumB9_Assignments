package SeleniumAssignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestByTagName {

    public static void main(String[] args) throws InterruptedException{

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://parabank.parasoft.com");

        List<WebElement> webElementList =  webDriver.findElements(By.tagName("a"));

        for(WebElement elements:webElementList){
            System.out.println(elements.getText()+" "+elements.getAttribute("href"));
        }

        System.out.println("---------------------------\n");

        List<WebElement> elementList = webDriver.findElements(By.tagName("p"));

        for(WebElement element:elementList){
            System.out.println(element.getText());
        }

        System.out.println("---------------------------\n");
        webDriver.quit();
    }

}
