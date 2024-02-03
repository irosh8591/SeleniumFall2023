package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager {

    public static WebDriver driver;


    public static WebDriver initChromeDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
    }

    public static void openTheSite(String URL) {
        driver.get(URL);
    }

    //Метод для поиска по ID
    public WebElement byID(String id) {
        return driver.findElement(By.id(id));
    }

    //Метод для поиска по ClassName
    public WebElement byClass(String className) {
        return driver.findElement(By.className(className));
    }

    //Метод для поиска по LinkedText
    public WebElement byLinked(String linkedText) {
        return driver.findElement(By.linkText(linkedText));
    }

    //Метод для поиска по PartialLink
    public WebElement byPartial(String partialLink) {
        return driver.findElement(By.partialLinkText(partialLink));
    }

    public static void  scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
    }




}