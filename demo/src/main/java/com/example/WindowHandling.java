package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String gridurl = "http://localhost:4444";
        WebDriver driver = new RemoteWebDriver(new URL(gridurl), new ChromeOptions());
        // maximize
        driver.manage().window().maximize();
        // getting the url
        driver.get("https://demoqa.com/browser-windows");
        String currentURL = driver.getCurrentUrl();
        Thread.sleep(4000);
     
        WebElement clickNewtab= driver.findElement(By.xpath("//*[@id=\"tabButton\"]");
        clickNewtab.click();


        // print the content from next page

driver.quit();

    }
}
