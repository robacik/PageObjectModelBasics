package com.w2a.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.utilities.ExtentManager;
import org.apache.log4j.spi.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


// add this from work

public class Actions {
    //public ExtentTest test;
    private static ExtentTest test = null;
    public ExtentReports rep = ExtentManager.getInstance();

    private WebDriver webDriver;

    public Actions() {
        this.test = new ExtentTest("Test Name 1111 ", "Description  blabla");
    }

    public Actions(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }


    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void type_XPATH(String locator_XPATH, String value) {

        webDriver.findElement(By.xpath(locator_XPATH)).sendKeys(value);
        System.out.println("ELEMENT _ pisatelny");
        test.log(LogStatus.INFO, "tu som:  pisem ... : " + locator_XPATH);

    }


    public void click_XPATH(String locator_XPATH) {
        webDriver.findElement(By.xpath(locator_XPATH)).click();
        System.out.println("ELEMENT _ klikatelny - kliknuty");
        test.log(LogStatus.INFO, "tu som:  klikam na login page ... : " + locator_XPATH);


    }

}

