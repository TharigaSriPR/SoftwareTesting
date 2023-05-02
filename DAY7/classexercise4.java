package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise4 {
	WebDriver d;
	  @Test
	  public void f() throws InterruptedException {
	  Thread.sleep(4000);
	  WebElement name=d.findElement(By.name("username"));
	  name.sendKeys("Admin");
	  WebElement pwd=d.findElement(By.name("password"));
	  pwd.sendKeys("admin123");
	  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(4000);
	  String tname=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	  Assert.assertEquals(tname, "Dashboard");
	  }
	  @Parameters({"browser"})
	  @BeforeMethod
	  public void beforeMethod(String browser1) {
		  if(browser1.equals("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  ChromeOptions co=new ChromeOptions();
			  co.addArguments("--remote-allow-origins=*");
			  d=new ChromeDriver();
			  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  d.manage().window().maximize();
		  }
		  else if(browser1.equals("edge")) {
			  WebDriverManager.edgedriver().setup();
			  d=new EdgeDriver();
			  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  d.manage().window().maximize();
		  }
	  }

	  @AfterMethod
	  public void afterMethod() {
		  d.close();
	  }
	
	
}
