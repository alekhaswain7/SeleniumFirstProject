package dev.selenium.chcekBoxes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sampleCheckBoxTwo {

    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCheckBoxTwo(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        for(WebElement checkBox : checkBoxes){

            if (checkBox.isSelected()) {
                System.out.println("Already Checked");
            } else{
                checkBox.click();
            }
        }
    }

}
