package com.automationsession.July5;

import org.openqa.selenium.WebDriver;

public interface BrowserDriverInterface {

    public void maximizeWebBrowser(WebDriver webDriver);

    public void minimizeWebBrowser(WebDriver webDriver);

    public void clearAllBrowerCookies(WebDriver webDriver);

    public void launchWebBrowser();

    public WebDriver getWebDriver();

    public void startWebDriver();

    public void closeWebDriver(WebDriver webDriver);

    public void startRecordVideo(WebDriver webDriver);
}
