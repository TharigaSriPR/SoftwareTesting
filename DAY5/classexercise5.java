package com.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.safaridriver().setup();
        WebDriver d=new ChromeDriver();
        WebDriver d1=new EdgeDriver();
        WebDriver d2=new FirefoxDriver();
        WebDriver d3=new SafariDriver();
        
        
        d.get("https://www.google.com/");
        d.findElement(By.name("q")).sendKeys("Apple");
        d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        String title = d.getTitle();
        System.out.println(d.getWindowHandle());
        
        
        d1.get("https://www.google.com/");
        d1.findElement(By.name("q")).sendKeys("Selenium");
        d1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        String title1 = d1.getTitle();
        System.out.println(d1.getWindowHandle());
        
        
        d2.get("https://www.google.com/");
        d2.findElement(By.name("q")).sendKeys("Cucumber");
        d2.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        String title2 = d2.getTitle();
        System.out.println(d2.getWindowHandle());
	}

}
