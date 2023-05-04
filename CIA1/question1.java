package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ChromeOptions co = new ChromeOptions();
//        co.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.in/Adidas-Synthetic-Predator-Accuracy-3-Football/dp/B0BPCY2YFW/ref=sr_1_15?keywords=adidas%2Bfootball%2Bboots%2Bpredator&qid=1683191354&s=shoes&sprefix=addidas%2Bfootball%2Bboots%2B%2Cshoes%2C411&sr=1-15&th=1&psc=1");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7904161298");
//        driver.findElement(By.id("continue")).click();
//        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Siripaapay");
//        driver.findElement(By.id("signInSubmit")).click();
//
//        Thread.sleep(10000);
//        
//        driver.manage().window().maximize();
//        String title = driver.getTitle();
//        String etitle="Buy Adidas Women Synthetic Predator Accuracy.3 FG Football Shoes CBLACK/CBLACK/FTWWHT(UK-11) at Amazon.in";
//        System.out.println(title);
//        if(title.equals(etitle)) {
//        	System.out.println("Title is matching");
//        }
//        else {
//        	System.out.println("Title Mismatch");
//        }
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/s?i=electronics&bbn=1805560031&rh=n%3A976419031%2Cn%3A1389401031%2Cn%3A1389432031%2Cn%3A1805560031%2Cp_36%3A1318505031%2Cp_n_condition-type%3A8609960031&ref_=tile1_below10k&pf_rd_r=JG6ACRFRGVMF1REN5FGN&pf_rd_p=6e9c5ebb-d370-421b-8375-bf50155e0300&pd_rd_r=e8601523-4a03-46c5-8db1-804b64da169b&pd_rd_w=CCN04&pd_rd_wg=TU7z0");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7904161298");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Siripaapay");
        driver.findElement(By.id("signInSubmit")).click();
        System.out.println("Account signed successfully");
        Thread.sleep(3000);
        driver.get("https://www.amazon.in/ASUS-15-6-inch-GeForce-Windows-FA506IHRZ-HN111W/dp/B0B5DZTNZQ?ref_=Oct_DLandingS_D_6c1a28b8_61");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String etitle = "ASUS TUF Gaming A15, 15.6-inch (39.62 cms) FHD 144Hz, AMD Ryzen 5 4600H, 4GB NVIDIA GeForce GTX 1650, Gaming Laptop (8GB/512GB SSD/Windows 11/Black/2.3 Kg), FA506IHRZ-HN111W : Amazon.in: Computers & Accessories";
        System.out.println("Buy Adidas Women Synthetic Predator Accuracy.3 FG Football Shoes CBLACK/CBLACK/FTWWHT(UK-11) at Amazon.in");
        if(title.equals(etitle)) {
        	System.out.println("TITLE IS MATCHED");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("Is item added to cart:" + present);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(removeText.equals(extext)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/ASUS-15-6-inch-GeForce-Windows-FA506IHRZ-HN111W/dp/B0B5DZTNZQ?ref_=Oct_DLandingS_D_6c1a28b8_61");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
        Thread.sleep(1000);
        String sign = driver.getTitle();
        System.out.println(sign);
        String esign = "Amazon Sign In";
        if(sign.equals(esign)) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("SUCCESS");
        }
        

	}

}


    	