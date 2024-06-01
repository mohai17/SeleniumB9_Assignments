package SeleniumAssignment04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException{

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://demoqa.com/droppable");
        webDriver.manage().window().maximize();



        Thread.sleep(3000);
        new Actions(webDriver).scrollToElement(webDriver.findElement(By.id("draggable"))).perform();

        new Actions(webDriver).dragAndDrop(webDriver.findElement(By.id("draggable")),webDriver.findElement(By.id("droppable"))).perform();

        Thread.sleep(3000);

        webDriver.quit();


    }

}
