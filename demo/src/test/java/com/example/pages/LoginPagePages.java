package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.uistore.BookStoreLoginUI;
import com.example.utils.WebDriverHelper;

public class LoginPagePages {

    BookStoreLoginUI loginUiLocators = new BookStoreLoginUI();

    private WebDriver driver = null;

    public LoginPagePages(WebDriver driver) {

        this.driver = driver;

    }

    public void enter_username() {
        WebElement usernameBox = WebDriverHelper.getElementByXpath(loginUiLocators.usernameXpath);
        usernameBox.sendKeys("Test@123");

    }

    public void enter_password() {
        WebElement passwordBox = driver.findElement(loginUiLocators.passwordXpath);
        passwordBox.sendKeys("Test@123");
    }

    public void login_button() {
        WebElement loginButton = driver.findElement(loginUiLocators.loginButtonXpath);
        loginButton.click();
    }

}
