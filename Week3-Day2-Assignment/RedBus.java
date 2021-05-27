package week3.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='src']").sendKeys("C");
		driver.findElementByXPath("(//ul[@class='autoFill']//li)[2]").click();
		driver.findElementByXPath("//input[@id='dest']").sendKeys("C");
		driver.findElementByXPath("(//ul[@class='autoFill']//li)[1]").click();
		driver.findElementByXPath("//td[@class='current day']").click();
		driver.findElementByXPath("//button[@id='search_btn']").click();
		driver.findElementByXPath("(//div[@class='sodc-doj-c  m-r-20'])[1]").click();
		driver.findElementByXPath("//div[@class='close']/i").click();
		String buses = driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
		System.out.println("Total Buses = "+buses);
		Thread.sleep(3000);
		driver.findElementByXPath("//li[@class='checkbox']/label[@class='custom-checkbox'][@for='bt_SLEEPER']").click();
		Thread.sleep(3000);
		String sleeperBuses = driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
		System.out.println("Sleeper Buses = "+sleeperBuses);
		Thread.sleep(3000);
		driver.findElementByXPath("//li[@class='checkbox']/label[@class='custom-checkbox'][@for='bt_AC']").click();
		Thread.sleep(3000);
		String acBuses = driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
		System.out.println("AC Buses = "+acBuses);
	}
}
