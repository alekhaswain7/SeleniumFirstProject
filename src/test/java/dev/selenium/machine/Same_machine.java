package dev.selenium.machine;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Same_machine {

    WebDriver driver;

    //W8: p4

    @Test
    public void test1() throws MalformedURLException {
        EdgeOptions eo=new EdgeOptions();
        driver=new RemoteWebDriver(new URL("http://172.19.16.1:4444"),eo);
        driver.get("https://www.disneystar.com/");

    }

    @Test
    public void test2() throws MalformedURLException {
        //WebDriverManager.edgedriver().setup();
        EdgeOptions eo=new EdgeOptions();
        driver=new RemoteWebDriver(new URL("http://172.19.16.1:4444"),eo);
        driver.get("https://www.hotstar.com/");


    }
}
