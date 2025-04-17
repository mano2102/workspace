package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
      String url="http://localhost:4444";
        WebDriver driver = new RemoteWebDriver(new URL(url),new ChromeOptions());
        // maximize
        driver.manage().window().maximize();
        // getting the url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // username 
        WebElement username=driver.findElement(By.name("username"));
        username.click();
        username.sendKeys("Admin");
        // password
        WebElement password =driver.findElement(By.xpath("//input[@name='password'] ")) ;
        password.click();
        password.sendKeys("admin123");
        // login click
        WebElement login = driver.findElement(By.xpath(""));
        login.click();
    }
}
