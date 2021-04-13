package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class tShirtsPage {


    public WebElement findElement(By by) {
        return browserPage.getDriver().findElement(by);
    }

    public WebElement tShirtsTab() {
        return findElement(By.xpath("//div/ul/li/a[@title='T-shirts'][text()='T-shirts']"));
    }

    public WebElement selectTShirt() {
        return findElement(By.xpath("//a/img[@title='Faded Short Sleeve T-shirts']"));
    }

    public WebElement addToCart() {
        return findElement(By.xpath("//span[text()='Add to cart']"));
    }

    public WebElement proceedToCheckOut() {
        return findElement(By.xpath("//a[@title='Proceed to checkout']"));
    }


    public WebElement myOrderSummary() {
        return findElement(By.xpath("//td/p[@class='product-name']/a"));
    }

    public WebElement clickSignIn() {
        return findElement(By.xpath("//a[@class='login']"));
    }

    public WebElement emailId() {
        return findElement(By.id("email"));
    }

    public WebElement password() {
        return findElement(By.id("passwd"));
    }

    public WebElement signIn() {
        return findElement(By.id("SubmitLogin"));
    }

    public WebElement myAccount() {
        return findElement(By.id("my-account"));
    }

    public WebElement myPersonalInfo() {
        return findElement(By.xpath("//span[text()='My personal information']"));
    }

    public WebElement myFirstNameTextBox() {
        return findElement(By.id("firstname"));
    }

    public WebElement myOldPassword() {
        return findElement(By.id("old_passwd"));
    }

    public WebElement buttonSave() {
        return findElement(By.xpath("//button[@name='submitIdentity']"));
    }

    public WebElement backToYourAccount() {
        return findElement(By.xpath("//a[@class='btn btn-default button button-small'][@href='http://automationpractice.com/index.php?controller=my-account']"));
    }

}
