package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_1 {

   public static void main(String[] args) throws MalformedURLException {
    String gridurl = "http://localhost:4444";
        WebDriver driver = new RemoteWebDriver(new URL(gridurl), new ChromeOptions());
        // maximize
        driver.manage().window().maximize();
        // getting the url
        driver.get();
   }

    
    
}
