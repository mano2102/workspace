package com.example.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsHelper {
    public static ExtentReports extentreports() {
        ExtentReports reports = new ExtentReports();
        String path = System.getProperty("usr.dir") + "/reports/extentreport.html";

        ExtentSparkReporter spark = new ExtentSparkReporter(path);
        reports.attachReporter(spark);
        return reports;
    }
}
