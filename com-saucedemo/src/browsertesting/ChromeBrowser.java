package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {


    public static void main(String[] args) {
        //Opening browser version
        String  baseUrl = "https://www.saucedemo.com/";

        //launch the Chrome Broewser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current Url
        driver.getCurrentUrl();
        System.out.println("Current URL:"+ driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source:" + driver.getPageSource());

        //Find the Email feild element
        driver.findElement(By.id("user-name")).sendKeys("dhara123@gmail.com");

        //Find the Email feild element
        driver.findElement(By.id("password")).sendKeys("Aimhigh123");

        //Close the Browser
        driver.close();


    }
}

