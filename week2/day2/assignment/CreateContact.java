package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException
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
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Jeeva");
		driver.findElementById("lastNameField").sendKeys("P");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Jeeva");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Periyasamy");
		driver.findElementById("createContactForm_departmentName").sendKeys("CSE");
		driver.findElementById("createContactForm_description").sendKeys("Description");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("jeevainkpm@gmail.com");
		
		Select country = new Select(driver.findElementById("createContactForm_generalCountryGeoId"));
		country.selectByVisibleText("India");
		Thread.sleep(5000);
		
		Select state = new Select(driver.findElementById("createContactForm_generalStateProvinceGeoId"));
		state.selectByVisibleText("TAMILNADU");
		
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("Cleared description and important notes updated");
		driver.findElementByXPath("//input[@value='Update']").click();
		System.out.println(driver.getTitle());
	}

}
