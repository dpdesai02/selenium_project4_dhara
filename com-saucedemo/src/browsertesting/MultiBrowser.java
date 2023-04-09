package browsertesting;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver= new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Opening Broeser version
        String baseUrl = "https://www.saucedemo.com/";

        //Launch the Chrome Browser
        //WebDriver driver1 =new ChromeDriver();
        driver.get(baseUrl);

        //Print the current url
        driver.getCurrentUrl();
        System.out.println("Current URL:" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source:"+ driver.getPageSource());

        //Find the Email feild element
        driver.findElement(By.id("user-name")).sendKeys("dhara123@gmail.com");

        //Find the Email feild element
        driver.findElement(By.id("password")).sendKeys("Aimhigh123");

        //Close the Browser
       driver.close();

    }
    }


