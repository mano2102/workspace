package com.example.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverHelper {
    private WebDriver driver = null;

    WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementByXpath(By xpath) {
        return driver.findElement(xpath);
    }

}
