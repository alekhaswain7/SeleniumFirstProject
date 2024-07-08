package dev.selenium.others;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        /*open chrome browser
        * navigate to google.com
        * enter search term on the search box
        * click on the search button
        * validate the result */

        WebDriver driver= new ChromeDriver();
        CharSequence searchTerm = "Testing is fun";
        driver.get("https://www.google.com/");
        //locate the search box
        //location/ address as a WebElement
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        WebElement googleSearchButton = driver.findElement(By.name("btnK"));
        googleSearchButton.submit();
        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);
        Assert.assertTrue(pageTitle.contains(searchTerm));

        driver.close();
        driver.quit();

        

    }

}
