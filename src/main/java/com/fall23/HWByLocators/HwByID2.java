package com.fall23.HWByLocators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class HwByID2 extends BaseTest {

    @Test

    void byID2(){
        openTheSite ("https://demoqa.com/text-box");
        WebDriverManager elem = new WebDriverManager();

        WebElement userInputname = elem.byID("userName");
        WebElement emailInput = elem.byID("userEmail");
        WebElement currentAddress = elem.byID("currentAddress");
        WebElement permanentAddress = elem.byID("permanentAddress");
        WebElement submitBtn = elem.byID("submit");

        userInputname.sendKeys("Iroda");
        emailInput.sendKeys("irosh2905@gmail.com");
        currentAddress.sendKeys("Akhunbaeva 181");
        permanentAddress.sendKeys("Belinka 123");

        WebDriverManager.scrollPageDown();

        submitBtn.click();
    }


}
