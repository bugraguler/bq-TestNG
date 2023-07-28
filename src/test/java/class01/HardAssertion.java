package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
    // go to syntax HRMS application with wrong credentials
    // verify the message is "invalid credentials"

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyCredentials(){
        String expectedText="Invalid credentials";
        WebElement username= driver.findElement(By.id("txtUsername"));
        //username.sendKeys("NoAdmin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(text,expectedText);

        boolean displayed = username.isDisplayed();
        Assert.assertTrue(displayed);

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }



}
