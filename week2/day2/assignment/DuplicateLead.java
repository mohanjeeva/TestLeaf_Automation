package week2.day2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("jeevainkpm@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebElement nameWeb=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		String name=nameWeb.getText();
		System.out.println(name);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String dupLead = driver.getTitle();
		if(dupLead.contains("Duplicate Lead"))
		{
			System.out.println("Tittle is verified");
			driver.findElementByName("submitButton").click();
			WebElement dupNameWeb = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
			String dupName = dupNameWeb.getText();
			System.out.println(dupName);
			if(name.equals(dupName))
			{
				System.out.println("Dupliacte is created");
			}
			else
			{
				System.out.println("Dupliacte is not created");
			}
			driver.close();
		}
		else
		{
			System.out.println("Tittle is not verified");
			driver.close();
		}
		
	}

}
