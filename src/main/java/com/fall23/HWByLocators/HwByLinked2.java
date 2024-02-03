package com.fall23.HWByLocators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class HwByLinked2 extends BaseTest {

    @Test

    void byLinked2() throws InterruptedException {
        openTheSite ("https://demoqa.com/links");

        WebDriverManager find = new WebDriverManager();

        WebElement linked = find.byLinked("Created");
        linked.click();
        Thread.sleep(5000);
    }
}
