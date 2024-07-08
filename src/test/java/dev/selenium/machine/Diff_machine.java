package dev.selenium.machine;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Diff_machine {

    WebDriver driver;

    @Test
    public void test3() throws MalformedURLException {


        ChromeOptions co=new ChromeOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),co);
        driver.get("https://www.disneystar.com/");


    }

    @Test
    public void test4() throws MalformedURLException {


        FirefoxOptions fo=new FirefoxOptions();
        driver=new RemoteWebDriver(new URL("http://172.19.16.1:4444"),fo);
        driver.get("https://www.hotstar.com/");

    }
}
