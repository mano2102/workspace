package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver driver = new ChromeDriver();

        // getting the url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        // driver.close();
    }
}
