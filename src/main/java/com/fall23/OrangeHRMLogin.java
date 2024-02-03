package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLogin {

    @Test
    void loginTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText, expectedDashboardText);

    }

    @Test(description = "login with invalid username and valid password")
    void loginWithInValidUsernameAndValidPasswordTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        String username = "Iroda";
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

    @Test(description = "login with valid username and invalid password")
    void loginWithValidUsernameAndInvalidPasswordTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


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
    void loginTest2(){
     System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     String username = "Admin";
     String password = "admin123";

     WebElement usernameInputField = driver.findElement(By.name("username"));
     WebElement passwordInputField = driver.findElement(By.name("password"));

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
 @Test
    void clickAdmin(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualAdminText = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).getText();
        String expectedAdminText = "Admin";
        Assert.assertEquals(actualAdminText,expectedAdminText);

        WebElement adminBtn = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
        adminBtn.click();
 }
      @Test

    void sendToEmail(){

          System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          String actualForgot = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).getText();
          String expectedForgot = "Forgot your password?";
          Assert.assertEquals(actualForgot,expectedForgot);

          WebElement forgotBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
          forgotBtn.click();

          String forgotName = "Admin";

          WebElement forgotNameInputField = driver.findElement(By.name("username"));
          forgotNameInputField.sendKeys(forgotName);

          String actualReset = driver.findElement(By.xpath("//button[2]")).getText();
          String expectedReset = "Reset Password";
          Assert.assertEquals(actualReset,expectedReset);

          WebElement resetBtn = driver.findElement(By.xpath("//button[2]"));
          resetBtn.click();




      }
}