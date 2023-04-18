package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
@Test
public void userShouldNavigateToRegisterPageSuccessfully(){

    // Find  the ‘Register’ link and click on the ‘Register’ link
    driver.findElement(By.xpath("//a[@class ='ico-register']")).click();
    String expectedMessage = "Register";
    WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Register']"));
    String actualMessage = actualTextElements.getText();
    Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on 'Register' link
        driver.findElement(By.xpath("//a[@class ='ico-register']")).click();
        //Select gender ratio button as per choice
        //Clicking for Male gender
      WebElement MaleRadioButton =  driver.findElement(By.id("gender-male"));
       MaleRadioButton.click();
       //Clicking for Female gender
        WebElement FemaleRadioButton =  driver.findElement(By.id("gender-female"));
        FemaleRadioButton.click();
        //Enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Radha");
        //Enter last name
        driver.findElement(By.id("LastName")).sendKeys("Rani");
        //select date of birth
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("10");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1984");
        driver.findElement(By.id("Email")).sendKeys("Boss123@gmail.com"); // enter Email address
             driver.findElement(By.id("Password")).sendKeys("Boss1234"); // enter  password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Boss1234");//enter confirm password
        //Click on Register button
        driver.findElement(By.id("register-button")).click();
        //Verify the text 'Your registration completed'
        String expectedMessage = "Your registration completed";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[text() = 'Your registration completed']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @After
    public void testDown(){

        closeBrowser();
    }
}

