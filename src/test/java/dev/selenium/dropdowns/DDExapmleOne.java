package dev.selenium.dropdowns;


import dev.selenium.constants.WebConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDExapmleOne {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void DDOne(){
        driver.get(WebConstants.URL);

    }
}
