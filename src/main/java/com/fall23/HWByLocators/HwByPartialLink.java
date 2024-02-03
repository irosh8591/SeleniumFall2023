package com.fall23.HWByLocators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class HwByPartialLink extends BaseTest {
     WebDriverManager find = new WebDriverManager();
  @Test
  void byPartialLink2() throws InterruptedException {
       openTheSite ("https://demoqa.com/links");

      WebElement partial = find.byPartial("Forbi");

      WebDriverManager.scrollPageDown();

      partial.click();

      Thread.sleep(5000);


  }


}
