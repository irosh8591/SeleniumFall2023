package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHMRLMethod {
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = initializeWebDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    @Test(description = "login with valid username and valid password")
    void loginWithValidUsernameAndValidPasswordTest() {
        String username = "Admin";
        String password = "admin123";
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);    // метод можно водить данные ;
        passwordInputField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.tagName("button")); // tag по названию тега
        loginBtn.click();
        String actualdashboardText = driver.findElement(By.tagName("h6")).getText();
        String expecteddashboardText = "Dashboard";
        Assert.assertEquals(actualdashboardText, expecteddashboardText);
    }

    @Test(description = "login with invalid username and valid password")
    void loginWithInValidUsernameAndValidPasswordTest() {
        String username = "Meerim";
        String password = "admin123";
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));
        usernameInputField.sendKeys(username);    // метод можно водить данные ;
        passwordInputField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.tagName("button")); // tag по названию тега
        loginBtn.click();

        String actualuserInvalid = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
        String expexteduserInvalid = "Invalid credentials";
        Assert.assertEquals(actualuserInvalid, expexteduserInvalid);
    }

    @Test(description = "login with invalid username and valid password")
    void loginWithValidUsernameAndInvalidPasswordTest() {
        String username = "Admin";
        String password = "ab12345";
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));
        usernameInputField.sendKeys(username);    // метод можно водить данные ;
        passwordInputField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.tagName("button")); // tag по названию тега
        loginBtn.click();

        String actualuserInvalid = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
        String expexteduserInvalid = "Invalid credentials";
        Assert.assertEquals(actualuserInvalid, expexteduserInvalid);
    }
    @Test
    void loginTest() {
    WebElement usernameInputField = driver.findElement(By.name("username"));
    WebElement passwordInputField = driver.findElement(By.name("password"));
        String username = "Admin";
        String password = "admin123";

       usernameInputField.sendKeys(username);
       passwordInputField.sendKeys(password);

    WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

    String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
    String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText,expectedDashboardText);
}

    @Test
    void loginTest2(){
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));
        String username = "Admin";
        String password = "admin123";

      usernameInputField.sendKeys(username);
      passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.xpath("//span[normalize-space()='Performance']")).getText();
        String expectedDashboardText = "Performance";
        Assert.assertEquals(actualDashboardText, expectedDashboardText);

        WebElement performanceBtn=driver.findElement(By.xpath("//span[normalize-space()='Performance']"));
        performanceBtn.click();
    }

    private WebDriver initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}