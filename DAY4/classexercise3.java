package com.Day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
        name.sendKeys("thari");
        WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
        email.sendKeys("727721eucs169@skcet.ac.in");
        WebElement myname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
        myname.sendKeys("kd");
        WebElement myemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
        myemail.sendKeys("kdkamu@gmail.com");
        WebElement button=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
        button.click();
        Thread.sleep(3000);
        WebElement agree=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
        agree.sendKeys("Amaithiyooo amaithiii");
        WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
        amount.sendKeys("10");
        WebElement button1=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
        button1.click();
        
        
        
	}

}
