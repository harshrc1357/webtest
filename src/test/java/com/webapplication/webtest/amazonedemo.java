package com.webapplication.webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonedemo {

    public static void main(String[] args) {

                WebDriver driver;
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");                
                driver=new ChromeDriver();
                driver.get("https://www.amazon.in/");
                String title= driver.getTitle();
                System.out.println(title);
                WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
                searchbox.sendKeys("hp laptop");
                WebElement submitbutton=driver.findElement(By.id("nav-search-submit-button"));
                submitbutton.click();
                WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"p_n_feature_browse-bin/1485947031\"]/span/a/div/label/i"));
                checkbox1.click();
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,5000)");
                driver.quit();
                

    }
}