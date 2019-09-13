package com.pik.contact.gui.selenium.setup;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    static private WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            //File file = new File("lib" + File.separator + "chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "/Users/nitin" +
            //                                              ".parashar/Downloads" +
            //                                              "/selenium_test_drivers/chromedriver");

            System.setProperty("webdriver.chrome.driver","chromedriver");

            driver = new ChromeDriver();    //can be replaced with HtmlUnitDriver for better performance

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        return driver;
    }

}
