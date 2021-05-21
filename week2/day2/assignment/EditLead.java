package week2.day2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Jeeva");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("Title verified");
			driver.findElementByXPath("//a[text()='Edit']").click();
			driver.findElementById("updateLeadForm_companyName").clear();
			driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf");
			driver.findElementByXPath("//input[@value='Update']").click();
			WebElement cmpNameWeb = driver.findElementById("viewLead_companyName_sp");
			String cmpName = cmpNameWeb.getText();
			if(cmpName.contains("TestLeaf"))
				System.out.println("Company Name Edited");
			else
				System.out.println("Company Name not Edited");
		}
		else
		{
			System.out.println("Title not verified");
			driver.close();
		}
	}

}
