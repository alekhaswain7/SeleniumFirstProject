package dev.selenium.tech_canvas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogIn {

    //    SEAT
     static WebDriver driver ;

    //    Set up
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //    Execute
    @Test
    public void testLogIn(){
        driver.get("https://techedge.techcanvass.co/Login.aspx");
        assertLogIn(driver.getTitle().trim());

        WebElement logInTextBox = driver.findElement(By.id("txtLoginid"));
        logInTextBox.clear();
        logInTextBox.sendKeys("alekhaswain7@gmail.cpm");

        WebElement passwordTextBox = driver.findElement(By.id("txtpassword"));
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Alekha@122");

        driver.findElement(By.id("btnLogin")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();


    }

    //    Assert
    public void assertLogIn(String actualTitle){
        String expectedTitle = "Techcanvass LMS Portal – TechEdge | Learning made simple";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    //    TearDown

    @AfterClass
    public static void tearDown(){
        driver.close();
        driver.quit();

    }
}
