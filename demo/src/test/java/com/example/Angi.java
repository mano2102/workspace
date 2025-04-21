package com.example;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Angi {

   private static WebDriver driver=null;

    @BeforeMethod
    public void launch_browser() throws MalformedURLException, InterruptedException{
        String gridurl = "http://localhost:4444";
        driver = new RemoteWebDriver(new URL(gridurl), new ChromeOptions());
        // maximize
        driver.manage().window().maximize();
        // getting the url
        driver.get("https://www.angi.com/");
        String currentURL = driver.getCurrentUrl();
        Thread.sleep(4000);
    }

    @AfterMethod
    public void tear_down(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Test
    public void test_01(){


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement twitter= driver.findElement(By.xpath("//*[@alt='Twitter']"));
        twitter.click();
        
    }
    
    
    @Test
    public void test_02(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement facebook= driver.findElement(By.xpath("//*[@alt='Facebbok']"));
        facebook.click();
    }
    @Test
    public void test_03(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement pintrest= driver.findElement(By.xpath("//*[@alt='Pinterest']"));
        pintrest.click();

    }







}