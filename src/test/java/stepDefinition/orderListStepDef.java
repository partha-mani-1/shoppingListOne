package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import operations.orderList;
import org.junit.Assert;

public class orderListStepDef {
    private orderList orderList = new orderList();
    private String myOrderList = "Faded Short Sleeve T-shirts";
    private String userName = "partha.Mani1@gmail.com";
    private String password = "Travel-1";
    private String newName = "Parthasarathy";

    @Given("I launch the home page of shopping list")
    public void iLaunchTheHomePageOfShoppingList() {
        orderList.clickTShirts();
    }

    @Then("I order one T-shirt")
    public void iOrderOneTShirt() {
        orderList.addToCart();
    }

    @Then("I verify the summary of order")
    public void iVerifyTheSummaryOfOrder() {
        Assert.assertTrue(myOrderList.equalsIgnoreCase(orderList.validateSummaryPage()));
    }


    @Given("I login to the shopping page")
    public void iLoginToTheShoppingPage() {

        orderList.loginToWebPage(userName, password);

    }

    @When("I click my account to change my name")
    public void iClickMyAccountToChangeMyName() {
        orderList.changeMyName(newName, password);
    }

    @Then("My name should change successfully")
    public void myNameShouldChangeSuccessfully() {
        Assert.assertTrue(orderList.verifyChangeOfName().equalsIgnoreCase(newName));
    }
}
