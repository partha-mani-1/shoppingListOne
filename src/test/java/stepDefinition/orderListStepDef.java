package stepDefinition;

import io.cucumber.java.en.Given;
import operations.orderList;

public class orderListStepDef {
    private orderList orderList = new orderList();

    @Given("I launch the home page of shopping list")
    public void iLaunchTheHomePageOfShoppingList() {
        orderList.clickTShirts();
    }
}
