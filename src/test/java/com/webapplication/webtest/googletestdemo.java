package com.webapplication.webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class googletestdemo {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");  
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		WebElement gmail = driver.findElement(By.className("gb_f"));
		gmail.click();
		WebElement signin=driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
		signin.click();
		driver.quit();
	}

}
