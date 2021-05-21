package week2.day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLearningAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup(); //set-up the browser
		FirefoxDriver driver = new FirefoxDriver(); //Line to open browser
		driver.get("http://leaftaps.com/opentaps/control/main"); //link to open the web application
		driver.manage().window().maximize();
		//Here we find elements of each action to be performed
		driver.findElementById("username").sendKeys("DemoSalesManager"); 
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		if(driver.getTitle().equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Title matches with the expected result");
		}
		else
		{
			System.out.println("Title not matches with the expected result");
		}
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("IQVIA");
		driver.findElementById("createLeadForm_firstName").sendKeys("Jeeva");
		driver.findElementById("createLeadForm_lastName").sendKeys("P");
		//Set the value for dropdown
		Select source=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		source.selectByIndex(1);
		
		Select market= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		market.selectByValue("CATRQ_CARNDRIVER");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Jeeva");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("P");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_birthDate").sendKeys("01/09/97");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("QA");
		driver.findElementById("createLeadForm_departmentName").sendKeys("CSE");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("360000");
		
		Select currency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		currency.selectByVisibleText("INR - Indian Rupee");
		
		Select industry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industry.selectByIndex(2);
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		Select ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		ownership.selectByIndex(5);
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		driver.findElementById("createLeadForm_description").sendKeys("Welcome to Selenium Learning");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("456");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9043796536");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Mother");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("jeevainkpm@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Jeeva P");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Periyasamy");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("10/377-A, ganapatypalayam, Vattamalai");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Kumarapalayam");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Salem");
		
		Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		country.selectByVisibleText("India");
		Thread.sleep(5000);
		
		Select state = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		state.selectByVisibleText("TAMILNADU");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("638183");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("044");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementByClassName("smallSubmit").click();
		
		if(driver.findElementById("createLeadForm_companyName").getText().equals("TestLeaf"))
			System.out.println("Duplicate created");
		else
			System.out.println("Duplicate not created");
				
	}

}
