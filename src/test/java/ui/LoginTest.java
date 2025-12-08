package ui;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void invalidLoginTest() {
        WebDriver driver = DriverFactory.getDriver();

        // Open Login Page
        driver.get("https://automationexercise.com/login");

        // Initialize Page Object
        LoginPage loginPage = new LoginPage(driver);

        // Perform actions
        loginPage.enterEmail("wrong@example.com");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLogin();

        // Verify error is displayed
        Assert.assertTrue(loginPage.isLoginErrorDisplayed(), "Error message not displayed for invalid login");
    }
}
