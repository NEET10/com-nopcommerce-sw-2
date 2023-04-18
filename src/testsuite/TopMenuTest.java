package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // Find 'Computer' tab and click on 'Computer' tab
       driver.findElement(By.xpath("//a[contains(@href,'computers')]")).click();
        // This is from requirement
        String expectedMessage= "Computers";
        // Validate actual and expected message
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Computers']"));
        // Find the text element and get the text
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find the 'Electronic' tab and click on it
        driver.findElement(By.xpath("//a[contains(@href ,'electronics')]")).click();
        String expectedMessage = "Electronics";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Electronics']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
       //Find the ‘Apparel’Tab  click on the ‘Apparel’Tab
        driver.findElement(By.xpath("//a[contains(@href ,'apparel')]")).click();
        String expectedMessage = "Apparel";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Apparel']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // Find the ‘Digital downloads’ Tab and click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[contains(@href ,'digital-downloads')]")).click();
        String expectedMessage = "Digital downloads";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Digital downloads']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
       //Find the ‘Books’Tab and click on the ‘Books’Tab
        driver.findElement(By.xpath("//a[@href ='/books']")).click();
       String expectedMessage = "Books";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Books']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find  the ‘Jewelry’ Tab and click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[@href ='/jewelry']")).click();
        String expectedMessage = "Jewelry";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Jewelry']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully (){
        //Find  the ‘Jewelry’ Tab and click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[@href ='/gift-cards']")).click();
        String expectedMessage = "Gift Cards";
        WebElement actualTextElements = driver.findElement(By.xpath("//div[@class = 'page-title'] //h1[text() = 'Gift Cards']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @After
    public void testDown(){
        closeBrowser();
    }
}