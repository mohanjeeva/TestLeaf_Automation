package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args)
	{
		//setup the browser
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		//Enter URL for the web application
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Assign time to check weather the application is run quickly within the given time(industry standard is 30s)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//this line is to maximize the web application
		driver.manage().window().maximize();
		
		//The below lines of code are to find/clear/enter the values of the field, textarea, dropdown.
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneNumber").sendKeys("9043796536");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebElement leadIdWeb = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String leadId=leadIdWeb.getText();
		//System.out.println(leadId);
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebElement result= driver.findElementByXPath("//div[text()='No records to display']");
		String output = result.getText();
		if(output.equals("No records to display"))
		{
			System.out.println("Lead is Deleted");
		}
		else
		{
			System.out.println("Lead is not Deleted");
		}
		driver.close();
			
	}

}
