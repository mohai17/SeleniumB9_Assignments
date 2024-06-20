package SeleniumAssignment03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class WebElements {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");

        Thread.sleep(3000);

        WebElement webElement = driver.findElement(By.cssSelector("input[id='login-button']"));
        String tagName = webElement.getTagName();
        int coOrdinateX = webElement.getRect().x;
        int coOrdinateY = webElement.getRect().y;
        String colorValue = webElement.getCssValue("background-color");

        WebElement webElement1 = driver.findElement(By.cssSelector("div[class='login_logo']"));

        String text = webElement1.getText();
        boolean isDisplayed = webElement1.isDisplayed();
        boolean isEnabled = webElement1.isEnabled();
        boolean isSelected = webElement1.isSelected();

        System.out.println("\n----------------------------");
        System.out.println("Tag Name: "+tagName);
        System.out.println("(X,Y) = "+coOrdinateX+","+coOrdinateY);
        System.out.println("Background Color: "+colorValue);
        System.out.println("Text: "+text);
        System.out.println("Is Displayed: "+isDisplayed);
        System.out.println("Is Enabled: "+isEnabled);
        System.out.println("Is Selected: "+isSelected);

        driver.quit();
    }
}
