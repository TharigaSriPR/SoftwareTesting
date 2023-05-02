package DAY7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise2{
	WebDriver d;
	  @Test (groups="smokeTest")
	  public void first() {
		  String etitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		  String atitle=d.getTitle();
		  AssertJUnit.assertEquals(etitle, atitle);
		  String curl="https://www.godaddy.com/en-in";
		  String url=d.getCurrentUrl();
		  AssertJUnit.assertEquals(curl,url);

	  }
	  @Test(groups="RegressionTestCase")
	  public void search() throws InterruptedException{
		  Timeouts implicitlyWait = d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		  WebElement fame=d.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
	      fame.click();
	      Thread.sleep(2000)
	;      WebElement lame=d.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
	     lame.click();
		  

	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  d=new ChromeDriver();
		  d.get("https://www.godaddy.com/en-in");
		  d.manage().window().maximize();
		  Thread.sleep(5000);
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	}


