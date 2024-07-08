package dev.selenium.chcekBoxes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplecheckbox {

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
        public void testCheckboxOne(){
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            WebElement firstCheckBox = driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]"));
            WebElement secondCheckBox=driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));

            if(!firstCheckBox.isSelected()){
                firstCheckBox.click();
            }
            if(!secondCheckBox.isSelected()){
                secondCheckBox.click();
            }
            else{
                System.out.println("Second checkbox is already checked");
            }
    }
}
