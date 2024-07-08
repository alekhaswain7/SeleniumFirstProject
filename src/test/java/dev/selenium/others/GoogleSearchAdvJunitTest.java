package dev.selenium.others;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAdvJunitTest {

//    SEAT
    static WebDriver driver ;
    String searchTerm = "Testing is fun";

//    Set up

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
    }

//    Execute
    @Test
    public void googleSearchTestAgain(){

        driver.get("https://www.google.com/");
        //locate the search box
        //location/ address as a WebElement
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        WebElement googleSearchButton = driver.findElement(By.name("btnK"));
        googleSearchButton.submit();
        String actualPageTitle = driver.getTitle();
        assertResultPage(actualPageTitle);
    }

//    Assert
    public void assertResultPage(String actualPageTitle){
        System.out.println("pageTitle = " + actualPageTitle);
        Assert.assertTrue(actualPageTitle.contains(searchTerm));
    }
//    TearDown
    @AfterClass
    public static void tearDown(){
        driver.close();
        driver.quit();
    }
}