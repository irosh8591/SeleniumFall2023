package com.fall23.locators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import com.fall23.WebElementManager;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.List;

import static com.fall23.WebDriverManager.openTheSite;

public class ByID extends BaseTest {



    @Test void byIDTest() throws InterruptedException  {


        openTheSite ("https://demoqa.com/text-box");
        WebElement usernameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("Wall street 555");
        permanentAddressInput.sendKeys("Sovet 123");

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 600)");

        submitBtn.click();
    }
}
