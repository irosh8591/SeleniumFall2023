package com.fall23.HWByLocators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;

public class Hw1 extends BaseTest {

 @Test
  void testOrangeHRML(){
      openTheSite ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

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
  }

  @Test
     void registrNambafood(){
     openTheSite("https://nambafood.kg/");

     String actualVoiti = driver.findElement(By.xpath("//i[contains(text(),'Войти')]")).getText();
     String expectedVoiti= "ВОЙТИ";
     Assert.assertEquals(actualVoiti,expectedVoiti);
     WebElement voitiBtn = driver.findElement(By.xpath("//button[@class='btn menu-link'][2]"));
     voitiBtn.click();
  }

}
