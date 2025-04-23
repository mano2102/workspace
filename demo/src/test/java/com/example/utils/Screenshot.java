package com.example.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.example.Hybrid;

public class Screenshot {

    WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void screenshot(String screenshotName) throws IOException {
        String folderPath = "/home/coder/project/workspace/demo/screenshots/";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(folderPath + screenshotName + ".png"));

    }

}
