package DAY7;

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

public class classexercise5 {
	WebDriver d;
	  @Test
	  public void test() throws InterruptedException {
		  Thread.sleep(4000);
		  WebElement name=d.findElement(By.name("username"));
		  name.sendKeys("Suvitha");
		  WebElement pwd=d.findElement(By.name("password"));
		  pwd.sendKeys("12345");
		  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(4000);
		  String tname=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		  Assert.assertEquals(tname, "Dashboard");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  d=new ChromeDriver();
		  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  d.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  d.close();
	  }

}
