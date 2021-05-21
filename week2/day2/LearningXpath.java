package week2.day2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath {

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriverManager.firefoxdriver().setup(); //set-up the browser
		FirefoxDriver driver = new FirefoxDriver(); //Line to open browser
		driver.get("http://leaftaps.com/opentaps/control/main"); //link to open the web application
		driver.manage().window().maximize();
		//Here we find elements of each action to be performed
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager"); 
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class = 'decorativeSubmit']").click();
		if(driver.getTitle().equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Title matches with the expected result");
		}
		else
		{
			System.out.println("Title not matches with the expected result");
		}
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("IQVIA");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Jeeva");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("P");
		//Set the value for dropdown
		Select source=new Select(driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']"));
		source.selectByIndex(1);
	
		Select market= new Select(driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']"));
		market.selectByValue("CATRQ_CARNDRIVER");
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Jeeva");
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("P");
		driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Mr");
		driver.findElementByXPath("//input[@id='createLeadForm_birthDate']").sendKeys("01/09/97");
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("QA");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("CSE");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("360000");
		
		Select currency = new Select(driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']"));
		currency.selectByVisibleText("INR - Indian Rupee");
		
		Select industry = new Select(driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']"));
		industry.selectByIndex(2);
		
		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("100");
		
		Select ownership = new Select(driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']"));
		ownership.selectByIndex(5);
		
		driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("123456");
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Welcome to Selenium Learning");
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("Important");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").clear();
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("91");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("456");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9043796536");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("044");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAskForName']").sendKeys("Mother");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("jeevainkpm@gmail.com");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("www.google.com");
		driver.findElementByXPath("//input[@id='createLeadForm_generalToName']").sendKeys("Jeeva P");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAttnName']").sendKeys("Periyasamy");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress1']").sendKeys("10/377-A, ganapatypalayam, Vattamalai");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress2']").sendKeys("Kumarapalayam");
		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Salem");
		
		Select country = new Select(driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']"));
		country.selectByVisibleText("India");
		Thread.sleep(5000);
		
		Select state = new Select(driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		state.selectByVisibleText("TAMILNADU");
		
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("638183");
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("044");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
	}

}
