package com.automationsession.Jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {

    public static void main(String[] args) {
        //Setting system properties of EdgeDriver
        System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");

        //Creating an object of EdgeDriver
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //Deleting all the cookies
        driver.manage().deleteAllCookies();

        //lunching URL
        driver.get("https://www.google.com/");

        driver.findElement(By.id("username")).sendKeys("ABCDF");

    }
}
