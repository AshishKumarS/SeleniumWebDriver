package test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test4 {

	static WebDriver driver;
	static String baseURL = "http://www.facebook.com";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("alert('Welcome to Facebook');");
		driver.get("http://www.google.com");
		js.executeScript("history.go(-1)");
		
		Thread.sleep(5000);
String sText  =  js.executeScript("return document.documentElement.innerText;").toString();
System.out.println(sText);
String sText1 =  js.executeScript("return document.title;").toString();
System.out.println(sText1);		
				
//		WebElement tagname = driver.findElement(By.xpath(".//*[@id='cpar1']"));
//		tagname.sendKeys("5");
		
//		WebElement tagname2 = driver.findElement(By.xpath(".//*[@id='cpar2']"));
//		tagname2.sendKeys("100");
		
		
//		tagname.click();
//		WebElement click = driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
//		click.click();
		
//		String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b")).getText();
//		System.out.println(result);
		
//		if(result.equals("5")){
//			System.out.println("Result Passed!!");
//		}else{
//			System.out.println("Result Failed");
				
	/*	driver.quit();*/
		
		
		
				
//	}
	
			
	}
	

}
