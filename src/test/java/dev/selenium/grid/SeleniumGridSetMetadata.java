package dev.selenium.grid;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridSetMetadata {

    //w8: P7

    WebDriver driver;

    @Test
    public void test1() throws MalformedURLException {
        String browserversion="126.0.6478.127";
        ChromeOptions fos=new ChromeOptions();

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.19.16.1:4444"), fos);
        String actualbrowserversion=driver.getCapabilities().getBrowserVersion().toString();
        if(actualbrowserversion.equals(browserversion)) {
            driver.get("https://www.disneystar.com/");
        }
        else {
            System.out.println("Desired Chrome version " + browserversion + " not available. Actual version is: " + actualbrowserversion);
        }
    }
}
