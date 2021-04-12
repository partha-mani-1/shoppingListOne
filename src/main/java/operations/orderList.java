package operations;

import pages.browserPage;
import pages.tShirtsPage;

public class orderList {
    private tShirtsPage tShirtsPage = new tShirtsPage();

    public void clickTShirts() {
        browserPage.getDriver().get("http://automationpractice.com/index.php");
        tShirtsPage.tShirtsTab().click();
    }

    public void addToCart() {
        tShirtsPage.selectTShirt().click();
        tShirtsPage.addToCart().click();
        tShirtsPage.proceedToCheckOut().click();
    }

    public String validateSummaryPage(){
        String summary = tShirtsPage.myOrderSummary().getText();
        return summary;
    }

    public void loginToWebPage(String username, String password){
        browserPage.getDriver().get("http://automationpractice.com/index.php");
        tShirtsPage.clickSignIn().click();
        tShirtsPage.emailId().sendKeys(username);
        tShirtsPage.password().sendKeys(password);
        tShirtsPage.signIn().click();
    }

    public void changeMyName(String newName, String password){
        tShirtsPage.myAccount().click();
        tShirtsPage.myPersonalInfo().click();
        tShirtsPage.myFirstNameTextBox().sendKeys(newName);
        tShirtsPage.myOldPassword().sendKeys(password);
        tShirtsPage.buttonSave().click();
        tShirtsPage.backToYourAccount();
    }

    public String verifyChangeOfName(){
        tShirtsPage.myAccount().click();
        tShirtsPage.myPersonalInfo().click();
        return tShirtsPage.myFirstNameTextBox().getText();

    }
}
