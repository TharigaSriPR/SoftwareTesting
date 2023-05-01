package com.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clasexercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver(co);
	        d.get("https://j2store.net/free/");
	        d.manage().window().maximize();
	        String actualURL=d.getCurrentUrl();
	        String expectedURL="https://j2store.net/free/";
	        if(expectedURL.equals(actualURL)) {
	        	System.out.println("URL MATCHED");
	        }
	        else {
	        	System.out.println("URL DID NOT MATCH");
	        }
	        d.findElement(By.linkText("Clothing (5)")).click();
	}

}
