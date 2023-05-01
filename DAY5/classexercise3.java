package com.Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement idval=d.findElement(By.name("cusid"));
        idval.sendKeys("401");
        d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        d.switchTo().alert().dismiss();
        idval.clear();
        WebElement val=d.findElement(By.name("cusid"));
        val.sendKeys("402");
        d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        d.switchTo().alert().accept();
        Alert a=d.switchTo().alert();
        String txt=a.getText();
        a.accept();
        System.out.print(txt);
       
	}

}
