package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {
        WebDriver driver = DriverFactory.getDriver();

        // Open website
        driver.get("https://automationexercise.com/");

        // Verify title
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        System.out.println("Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title mismatch");
    }
}
