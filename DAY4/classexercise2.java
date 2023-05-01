package com.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver(co);
        d.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        d.manage().window().maximize();
        WebElement fname=d.findElement(By.id("input-firstname"));
        fname.sendKeys("TharigaSri");
        WebElement lname=d.findElement(By.id("input-lastname"));
       lname.sendKeys("P R");
        WebElement Email=d.findElement(By.id("input-email"));
        Email.sendKeys("727721eucs169@skcet.ac.in");
        WebElement Password=d.findElement(By.id("input-password"));
        Password.sendKeys("Thari@15");
        JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		WebElement button=d.findElement(By.id("input-newsletter-yes"));
		button.click();
        
	}

}
