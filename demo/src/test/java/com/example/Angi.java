package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Angi {

    @BeforeClass
    public void before_class() {

        System.out.println("before class eecuted");
    }

    @BeforeMethod
    public void before_method() {
        System.out.println("before method executed");

    }

    @BeforeTest
    public void before_test() {
        System.out.println("Before test executed");
    }

    @Test(priority = 1)
    public void check_angi() {
        System.out.println("angi test eecuted");

    }

    @Test(priority=2)
    public void sampleTest_01() {
        System.out.println("sample test eecuted");
    }

    @Test(priority=3)
    public void sampleTest() {
        System.out.println("sample test eecuted-01");
    }

    @AfterClass
    public void after_class() {

        System.out.println("after class eecuted");
    }

    @AfterMethod
    public void after_method() {
        System.out.println("after method executed");

    }


    @AfterTest
    public void after_test() {
        System.out.println("after test executed");
    }
}