package com.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get("https://jqueryui.com/droppable/");
        d.switchTo().frame(0);
        Actions a=new Actions(d);
        WebElement source=d.findElement(By.id("draggable"));
        WebElement dest=d.findElement(By.id("droppable"));
        a.dragAndDrop(source, dest).build().perform();

        
        
	}

}
