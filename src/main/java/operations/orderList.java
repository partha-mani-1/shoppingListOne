package operations;

import pages.browserPage;
import pages.tShirtsPage;

public class orderList {
    private tShirtsPage tShirtsPage = new tShirtsPage();

    public void clickTShirts() {
        browserPage.getDriver().get("http://automationpractice.com/index.php");
        tShirtsPage.tShirts().click();
    }
}
