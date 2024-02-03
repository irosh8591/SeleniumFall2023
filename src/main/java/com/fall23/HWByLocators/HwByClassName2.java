package com.fall23.HWByLocators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class HwByClassName2  extends BaseTest {

    @Test

    void byClassName2 (){
        WebDriverManager find = new WebDriverManager();

        openTheSite ("https://demoqa.com/text-box");
        WebElement userInput = find.byID("userName");
        WebElement emailInput = find.byID("userEmail");
        WebElement currentAddress = find.byID("currentAddress");
        WebElement permanentAddress= find.byID("permanentAddress");
        WebElement sbmBtn = find.byClass("btn-primary");

        userInput.sendKeys("Iroda");
        emailInput.sendKeys("iroda@gmail.com");
        currentAddress.sendKeys("Sovet 234");
        permanentAddress.sendKeys("belinkla 123");

        WebDriverManager.scrollPageDown();

        sbmBtn.click();

    }
}
