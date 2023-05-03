package DAY8;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class classexercise1 {
//after pubic class CE1 type the below code
	static ExtentTest test;
	static ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	@BeforeClass
	public void startReport() {
		
		htmlReporter =  new ExtentHtmlReporter("/Users/thari/Desktop/Testing/report1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//configuration items to change the look and feel
		//add content, manage tests etc
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("My Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		// htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
	WebDriver driver;
  @Test(priority=1)
  public void CE_1() {
	  String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle);
	  String actualURL = driver.getCurrentUrl();
	  String expectedURL = "https://www.godaddy.com/en-in";
	  Assert.assertEquals(expectedURL, actualURL);
	  test = extent.createTest("Test Case 1", "The test case 1 has passed");
  }
  @Test(priority=2)
  public void CE_2() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  test = extent.createTest("Test Case 2", "The test case 2 has passed");
	  }
  @Test(priority=3)
  public void CE_3() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  String expectedTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isEnabled();
	  
	  test = extent.createTest("Test Case 3", "The test case 3 has passed");
  }
//post all the tests type the below code

@AfterMethod
	  public void getResult(ITestResult result) {
		  if(result.getStatus() == ITestResult.FAILURE) {
	          test.log(Status.FAIL,result.getThrowable());
	      }
	      else if(result.getStatus() == ITestResult.SUCCESS) {
	          test.log(Status.PASS, result.getTestName());
	      }
	      else {
	          test.log(Status.SKIP, result.getTestName());
	      }
		  driver.close();
	  }
	  @AfterTest
	  public void tearDown() {
	      //to write or update test information to reporter
	      extent.flush();
	  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origin=*");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
}