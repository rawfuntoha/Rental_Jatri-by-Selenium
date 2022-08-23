package selenium.rental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rentalweb {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.rental.jatri.co/mobile-verification");
		driver.findElement(By.xpath("//input[@placeholder='Input your mobile no']")).sendKeys("01521436484");
		driver.findElement(By.xpath("//button[normalize-space()='Send Code']")).click();
		synchronized (driver)
		{
			driver.wait(40000);
		}
		driver.findElement(By.xpath("//button[normalize-space()='Verify Code']")).click();
		synchronized (driver)
		{
			driver.wait(5000);
		}
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Request trip')]")).click();
		synchronized (driver)
		{
			driver.wait(5000);
		}
		driver.findElement(By.xpath("//input[@id='pickAddress']")).sendKeys("Khulna City, Khulna, Bangladesh");
		synchronized (driver)
		{
			driver.wait(5000);
		}
		driver.findElement(By.xpath("//input[@id='dropAddress']")).sendKeys("Sylhet, Bangladesh");
		
		synchronized (driver)
		{
			driver.wait(30000);
		}
		//Review Trip Request
		driver.findElement(By.xpath("//button[contains(text(),'Review trip request')]")).click();
		
		synchronized (driver)
		{
			driver.wait(5000);
		}
		
		//Send Trip Request
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]/button[2]")).click();
		
		synchronized (driver){driver.wait(50000);}
		//Req Confirm
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		synchronized (driver){driver.wait(5000);}
		//Car Details
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/img[1]")).click();
		synchronized (driver){driver.wait(5000);}
		driver.navigate().back();
		synchronized (driver){driver.wait(5000);}
		//Partner Info
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[14]/div[2]/img[1]")).click();
		synchronized (driver){driver.wait(5000);}
		driver.navigate().back();
		synchronized (driver){driver.wait(5000);}
		//Verify OTP Button
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		synchronized (driver){driver.wait(100000);}
		//Verify OTP Confirm
		driver.findElement(By.xpath("//button[contains(text(),'Verify Otp')]")).click();
		synchronized (driver){driver.wait(5000);}
		//View Trip Deatails
		driver.findElement(By.xpath(" //button[contains(text(),'View trip details')]")).click();
		synchronized (driver){driver.wait(3000);}
		//Review Trip
		driver.findElement(By.xpath("//p[contains(text(),'Review trip')]")).click();
		synchronized (driver){driver.wait(3000);}
		//Rating
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[3]/div[5]/img[1]")).click();
		synchronized (driver){driver.wait(3000);}
		//Review
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[4]/textarea[1]")).sendKeys("Test Review");
		synchronized (driver){driver.wait(3000);}
		//Review Submit
		driver.findElement(By.xpath("//button[contains(text(),'Submit review')]")).click();
		synchronized (driver){driver.wait(3000);}
		//Done After Review
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		synchronized (driver){driver.wait(3000);}
		//Trip History
		driver.get("https://dev.rental.jatri.co/trip-history");
		
		synchronized (driver){driver.wait(3000);}
		
		  //Driver With Jatri
		  driver.get("https://dev.rental.jatri.co/drive-with-jatri");
		  synchronized (driver){driver.wait(3000);}
		  //Driver Name
		  driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Driver Watson");
		  synchronized (driver){driver.wait(3000);}
		  //Phone No (Need to change Every Time)
		  driver.findElement(By.xpath("//input[@title='mobile number can be digit(0-9) only']")).sendKeys("01468596458");
		  synchronized (driver){driver.wait(3000);}
		  //Division
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/select[1]")).sendKeys("Dhaka");
		  synchronized (driver){driver.wait(3000);}
		  //Submit
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		  synchronized (driver){driver.wait(3000);}
		  
		  
		  
		  //Jatri For Business
		  
		  driver.get("https://dev.rental.jatri.co/business");
		  

		  // driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
		  //Name
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/input[1]")).sendKeys("Watson & Company");
		  //Email
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/input[2]")).sendKeys("watson@gmail.com");
		  //Phone
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]")).sendKeys("01789658692");
		  //Company Name
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/input[3]")).sendKeys("Watson Private Ltd");
		  //Employee No
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/div[3]/select[1]")).sendKeys("21-30");
		  //Note
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/textarea[1]")).sendKeys("Note:Small Note");
		  //Submit
		  synchronized (driver){driver.wait(3000);}
		  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/form[1]/div[5]/button[1]")).click();

		  synchronized (driver){driver.wait(3000);}
		  driver.get("https://dev.rental.jatri.co/");
		
		
		
	}

}
