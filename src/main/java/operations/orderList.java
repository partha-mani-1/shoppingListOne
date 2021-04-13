package operations;

import pages.browserPage;
import pages.tShirtsPage;

public class orderList {
    private tShirtsPage tShirtsPage = new tShirtsPage();
    private static final String WEB_PAGE = "http://automationpractice.com/index.php";

    public void clickTShirts() {
        browserPage.getDriver().get(WEB_PAGE);
        tShirtsPage.tShirtsTab().click();
    }

    public void addToCart() {
        tShirtsPage.selectTShirt().click();
        tShirtsPage.addToCart().click();
        tShirtsPage.proceedToCheckOut().click();
    }

    public String validateSummaryPage() {
        String summary = tShirtsPage.myOrderSummary().getText();
        return summary;
    }

    public void loginToWebPage(String username, String password) {
        browserPage.getDriver().get(WEB_PAGE);
        tShirtsPage.clickSignIn().click();
        tShirtsPage.emailId().sendKeys(username);
        tShirtsPage.password().sendKeys(password);
        tShirtsPage.signIn().click();
    }

    public void changeMyName(String newName, String password) {
        tShirtsPage.myAccount().click();
        tShirtsPage.myPersonalInfo().click();
        tShirtsPage.myFirstNameTextBox().clear();
        tShirtsPage.myFirstNameTextBox().sendKeys(newName);
        tShirtsPage.myOldPassword().sendKeys(password);
        tShirtsPage.buttonSave().click();
        tShirtsPage.backToYourAccount().click();
    }

    public String verifyChangeOfName() {
        tShirtsPage.myPersonalInfo().click();
        return tShirtsPage.myFirstNameTextBox().getAttribute("value");

    }
}
