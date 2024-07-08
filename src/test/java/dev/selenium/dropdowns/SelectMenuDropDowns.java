package dev.selenium.dropdowns;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMenuDropDowns {

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
    public void complexDropDowns(){
        driver.get("https://jqueryui.com/selectmenu/#default");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement SelectASpeedDropDown = driver.findElement(By.cssSelector("span[id='speed-button']"));
        SelectASpeedDropDown.sendKeys(Keys.DOWN);




    }
}
