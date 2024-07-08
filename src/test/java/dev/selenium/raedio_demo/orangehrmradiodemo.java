package dev.selenium.raedio_demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmradiodemo {

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
    public void testRadioOne() throws InterruptedException {
        LoginHRM loginHrm = new LoginHRM();
        loginHrm.login(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@type='radio]'[@value='2']/.."));
        femaleRadioButton.click();
        Thread.sleep(3000);
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@type='radio]'[@value='1']/.."));
        maleRadioButton.click();






    }
}
