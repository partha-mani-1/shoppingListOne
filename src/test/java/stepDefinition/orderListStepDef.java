package stepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orderListStepDef {
    @Given("I launch the home page of shopping list")
    public void iLaunchTheHomePageOfShoppingList() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        String baseUrl = "http://automationpractice.com/index.php";
        chromeDriver.get(baseUrl);
    }
}
