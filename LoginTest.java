package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//globally setting implicit wait command
		//JavascriptExecutor jse = (JavascriptExecutor)dr;
		//dr.get("https://coserv.com");
		
		dr.get("https://myaccount.coserv.com/");
		dr.findElement(By.className("genericBtn"));
		
		dr.get("https://webpayments.billmatrix.com/Coserv");
		//dr.findElement(By.className("genericBtn"));
		//dr.navigate().to("https://myecogridaccount.coserv.com/");
		//dr.get("https://myecogridaccount.coserv.com/");
		//dr.findElement(By.xpath("//*[@id='loginLink']/div/a[1]")).click();
		
		//dr.findElement(By.xpath("//*[@id='LoginEmail']")).sendKeys("rchiravuri@gmail.com");
		//dr.findElement(By.xpath("//*[@id='LoginPassword']")).sendKeys("Current2015");
		//dr.findElement(By.xpath("//*[@id='LoginContainer']/div/button")).click();
		
		//dr.navigate().to("https://paymentscoserv.billmatrix.com/Welcome.aspx");
		//dr.findElement(By.xpath("//*[@id='fma']/div/h1/div[2]/a")).click();
		dr.findElement(By.id("BillAccountNumber")).sendKeys("2000335696");
		dr.findElement(By.xpath("//*[@id='BillSubAccount']")).sendKeys("0000499895");
		dr.findElement(By.xpath("//*[@id='EmailAddress']")).sendKeys("rchiravuri@gmail.com");
		
		dr.findElement(By.xpath("//*[@id='btnContinue']")).click();
		//dr.findElement(By.xpath("//*[@id='ctl00_MainContentHolder_nextButton']")).click();
		//dr.findElement(By.xpath("//*[@id='billPayWidget']/div/div/a")).click();
		
		
		dr.findElement(By.xpath("//*[@id='PaymentInfoList_0__PaymentAmount']")).clear();
		dr.findElement(By.xpath("//*[@id='PaymentInfoList_0__PaymentAmount']")).sendKeys("1.00");
		dr.findElement(By.id("btnPayNow_Continue")).click();
		//dr.findElement(By.xpath("//*[@id='btnContinue']")).click();
		
		dr.findElement(By.xpath("//*[@id='btnReview_Pay']")).click();
		//dr.findElement(By.className("span.staus")).getText();
		dr.findElement(By.className("icons schedule")).getText();
		
		
		
		
		
		
		//click on Authorize button
		//dr.findElement(By.xpath("//*[@id='ctl00_MainContentHolder_nextButton']")).click();
		
	}
	
}
