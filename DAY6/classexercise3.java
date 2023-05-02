package day6;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class classexercise3 {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {       
	  WebElement fname=d.findElement(By.name("username"));
      fname.sendKeys("Admin");
      WebElement lname=d.findElement(By.name("password"));
     lname.sendKeys("admin123");
     WebElement button=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		button.click();
	 Thread.sleep(5000);
	 String find=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	 AssertJUnit.assertEquals(find,"Dashboard");
	
     
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  ChromeOptions co=new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      WebDriverManager.chromedriver().setup();
      d=new ChromeDriver();
      d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  d.manage().window().maximize();
	  Thread.sleep(5000);

  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }

}
