package day6;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class classexercise1 {  
  WebDriver d;

  @Test
  public void f() {
	  d.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String etitle="Guest Registration Form – User Registration";
	  String atitle=d.getTitle();
	  AssertJUnit.assertEquals(etitle, atitle);

	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions co=new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      WebDriverManager.chromedriver().setup();
      d=new ChromeDriver();

      
      
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }

}
