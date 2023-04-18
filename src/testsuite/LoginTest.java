package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click(); // clicking on the login link
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextElements = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals("Not providing login page", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.linkText("Log in")).click(); // click on the login link
        driver.findElement(By.id("Email")).sendKeys("Boss123@gmail.com"); // enter valid user name
        driver.findElement(By.id("Password")).sendKeys("Boss1234"); // enter valid password
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click(); //click on login button

        //HOW TO VERIFY THE 'LOG OUT' TEXT IS DISPLAYED??
    }
    @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.linkText("Log in")).click(); // click on the login link
        driver.findElement(By.id("Email")).sendKeys("Boss123@gmail.com"); // enter valid user name
        driver.findElement(By.id("Password")).sendKeys("Boss1234"); // enter valid password
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click(); //click on login button
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']"));
        String actualErrorMessage = actualTextElements.getText();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        Assert.assertEquals( expectedErrorMessage, actualErrorMessage);
    }
    @After
    public void testDown(){
        closeBrowser();
    }
}
