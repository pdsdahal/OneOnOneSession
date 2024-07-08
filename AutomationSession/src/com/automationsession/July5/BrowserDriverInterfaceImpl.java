package com.automationsession.July5;

import org.openqa.selenium.WebDriver;

public class BrowserDriverInterfaceImpl implements BrowserDriverInterface {
    @Override
    public void maximizeWebBrowser(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    @Override
    public void minimizeWebBrowser(WebDriver webDriver) {
        webDriver.manage().window().minimize();

    }

    @Override
    public void clearAllBrowerCookies(WebDriver webDriver) {
        webDriver.manage().deleteAllCookies();

    }

    @Override
    public void launchWebBrowser() {

    }

    @Override
    public WebDriver getWebDriver() {
        return null;
    }

    @Override
    public void startWebDriver() {

    }

    @Override
    public void closeWebDriver(WebDriver webDriver) {

    }

    @Override
    public void startRecordVideo(WebDriver webDriver) {

    }
}
