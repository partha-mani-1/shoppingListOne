package operations;

import org.openqa.selenium.WebDriver;
import pages.browserPage;

public class browser {
    public static WebDriver driver;

    public browser(){
    }

    public void beforeMethodClass(){
        System.out.println("in @BeforeMethod");
        browser.driver = browserPage.getDriver();
    }
}
