package class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(groups = "regression")
    public void verifyCredentials() {
        SoftAssert softAssert = new SoftAssert();
        String expectedText = "Invalid credentials";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("NoAdmin");
        boolean displayed = username.isDisplayed();
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //assertion to check if the message is true or not
        softAssert.assertEquals(text, expectedText);

        //validate the display  is true or not
        System.out.println("Hello world");
        displayed = true;
        softAssert.assertTrue(displayed);

        //check all assertions
        System.out.println("hi wrıld");
        softAssert.assertAll();


    }

    @Test(groups = "regression")
    public void verifyCredentials2() {
        SoftAssert softAssert = new SoftAssert();
        String expectedText = "Invalid credentials";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("NoAdmin");
        boolean displayed = username.isDisplayed();
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //assertion to check if the message is true or not
        softAssert.assertEquals(text, expectedText);

        //validate the display  is true or not
        System.out.println("Hello world2");
        displayed = true;
        softAssert.assertTrue(displayed);

        //check all assertions
        System.out.println("hi wrıld2");
        softAssert.assertAll();


    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }


}

