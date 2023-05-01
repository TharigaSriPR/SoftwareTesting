package com.Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver(co);
	        d.get("https://j2store.net/free/");
	        d.manage().window().maximize();
	        d.findElement(By.linkText("Clothing (5)")).click();
            List<WebElement>products=d.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
            for(int i=0;i<products.size();i++) {
            	System.out.println(products.get(i).getText());
            }
            
	}

}
