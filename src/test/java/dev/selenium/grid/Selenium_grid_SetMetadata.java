package dev.selenium.grid;

import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium_grid_SetMetadata {

    //W8: p5

    WebDriver driver;

    @Test
    public void test1() throws MalformedURLException {
        ChromeOptions fos=new ChromeOptions();
        fos.setCapability("se:name", "My simple test");

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.19.16.1:4444"), fos);


        Capabilities capabilities = driver.getCapabilities();
        System.out.println("Capabilities: " + capabilities);
        String sessionName = (String) capabilities.getCapability("se:name");
        System.out.println("Session Name: " + sessionName);
        driver.get("https://www.disneystar.com/");

    }
}
