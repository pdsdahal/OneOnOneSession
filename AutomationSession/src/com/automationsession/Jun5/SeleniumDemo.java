package com.automationsession.Jun5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

    public void compareExpectedVsActual(String actual, String expected, String message){
        if(actual.equals(expected)){
            System.out.println("PASS "+message);
        }else{
            System.out.println("FAILED "+message);
        }
    }

    public void compareExpectedVsActual(boolean actual, boolean expected, String message){
        if(actual==expected){
            System.out.println("PASS "+message);
        }else{
            System.out.println("FAILED "+message);
        }
    }

    public static void main(String[] args) {

        // to set the browser configuration
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        //first step
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        //second step
        webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");

        //title
        String actualTitle = webDriver.getTitle();
        String expectedTitle = "Account Login";

        SeleniumDemo obj = new SeleniumDemo();
        obj.compareExpectedVsActual(actualTitle, expectedTitle, "Title");


       WebElement webElmReturningCustomer = webDriver.findElement(By.xpath("//*[text()='Returning Customer']"));
       boolean actualDisplayLbl = webElmReturningCustomer.isDisplayed();
       obj.compareExpectedVsActual(actualDisplayLbl, true, "Returning Customer should display");





        //close
       //webDriver.quit();

    }
}
