package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Hybrid {

    private static WebDriver driver = null;

    @BeforeMethod
    public void launch_browser() throws MalformedURLException, InterruptedException {
        String gridurl = "http://localhost:4444";
        driver = new RemoteWebDriver(new URL(gridurl), new ChromeOptions());
        // maximize
        driver.manage().window().maximize();
        // getting the url
        driver.get("https://demoqa.com/frames/");
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Thread.sleep(4000);
    }

    @AfterMethod
    public void tear_down() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(enabled = false)
    public void interact_with_frame() {
        String h1xpath = "//h1[@id='sampleHeading']";
        String iframe1Id = "frame1";
        String outsideFrame1 = "//div[@id='framesWrapper']//div[1]";
        // Switch to iframe
        driver.switchTo().frame(iframe1Id);
        WebElement h1Iframe1 = driver.findElement(By.xpath(h1xpath));
        System.out.println("Text inside the iframe 1 :" + h1Iframe1.getText());
        driver.switchTo().parentFrame();
        WebElement outsideFrame1Page = driver.findElement(By.xpath(outsideFrame1));
        System.out.println(outsideFrame1Page.getText());
        Assert.assertEquals("mano", "mano");
    }

    @Test
    public void login_demoPage() {
        driver.get("https://demoqa.com/profile");

        
    }

}