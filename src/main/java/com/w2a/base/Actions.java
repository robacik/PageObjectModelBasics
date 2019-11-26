package com.w2a.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.utilities.ExtentManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

// add this from work

public class Actions extends Page {

    protected WebDriver webDriver = null;

    private int actionWaitTimeout = 15000;  // how long to wait after some click

    public int getActionWaitTimeout() {
        return actionWaitTimeout;
    }
    public void setActionWaitTimeout(int timeOutInMillis) {
        this.actionWaitTimeout = timeOutInMillis;
    }

    public Actions() {
        //toDo:  look on name & description
        // this.test = new ExtentTest("Test Name 1111 ", "Description  blabla");
    }

    public Actions(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }



    public void type_XPATH(String locator_XPATH, String value) {
        webDriver.findElement(By.xpath(locator_XPATH)).sendKeys(value);
        log.info("Typing on the found element: " + locator_XPATH + " value: " + value);
        test.log(LogStatus.INFO, "Typing:" + value);
    }


    public void click_XPATH(String locator_XPATH) {
        webDriver.findElement(By.xpath(locator_XPATH)).click();
        log.info("Clicking on the found element : " + locator_XPATH);
        test.log(LogStatus.INFO, "Clicked on element:" + locator_XPATH);
    }
}

