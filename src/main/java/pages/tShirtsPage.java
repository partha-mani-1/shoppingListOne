package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class tShirtsPage {


    public WebElement findElement(By by) {
        return browserPage.getDriver().findElement(by);
    }


    public WebElement tShirts() {
        return findElement(By.xpath("//div/ul/li/a[@title='T-shirts'][text()='T-shirts']"));
    }


}
