package com.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get("https://www.abhibus.com/bus-ticket-booking");
        WebElement leave=d.findElement(By.id("source"));
        leave.sendKeys("Coimbatore");
        WebElement go=d.findElement(By.id("destination"));
        go.sendKeys("karur");
        d.findElement(By.id("datepicker1")).click();
        d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a")).click();
	}

}

//WebElement leave=d.findElement(By.id("source"));
//leave.sendKeys("Coimbatore",Keys.ENTER);
//Thread.sleep(3000);
//leave.sendKeys(Keys.ENTER);

//WebElement going=d.findElement(By.id("source"));
//going.sendKeys("Karur",Keys.ENTER);
//Thread.sleep(3000);
//going.sendKeys(Keys.ENTER);


//WebElement datepicks=d.findElement(By.id(""));
//datepicks.click();
//JavascriptExecutor js=(JavascriptExecutor) d;
//js.executeScript("arguments[0].setAttrivute('value','05/05/2023')",datepicks);
//WebElement search_btn=d.findElement(By.id(""));
//search_btn.click();