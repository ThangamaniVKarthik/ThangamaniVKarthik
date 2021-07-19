package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadInLeaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElementByXPath("(//a[contains(text(), CRM/SFA)])[2]").click();
		driver.findElementByLinkText("Leads").click();
//		driver.findElementByClassName("x-panel-header").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Companyname");
		driver.findElementById("createLeadForm_firstName").sendKeys("Firstname");
		driver.findElementById("createLeadForm_lastName").sendKeys("Lastname");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("localfname");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("locallname");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("abc");
		WebElement sourcedd = driver.findElementById("createLeadForm_dataSourceId");
		Select sdd = new Select(sourcedd);
		sdd.selectByVisibleText("Cold Call");
//		sdd.deselectAll();
		sdd.selectByValue("LEAD_CONFERENCE");
		WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mcdd = new Select(mc);
//		mcdd.deselectByIndex(3);
		mcdd.selectByVisibleText("Affiliate Sites");
		driver.findElementById("createLeadForm_birthDate").sendKeys("12/06/91");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Title");
		driver.findElementById("createLeadForm_departmentName").sendKeys("wer");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("789");
		WebElement pc = driver.findElementById("createLeadForm_currencyUomId");
		Select pcdd = new Select(pc);
//		pcdd.deselectAll();
		pcdd.selectByIndex(3);
		WebElement i = driver.findElementById("createLeadForm_industryEnumId");
		Select idd = new Select(i);
		idd.selectByVisibleText("Aerospace");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("13");
		;
		WebElement o = driver.findElementById("createLeadForm_ownershipEnumId");
		Select odd = new Select(o);
		odd.selectByValue("OWN_PROPRIETOR");
		driver.findElementById("createLeadForm_sicCode").sendKeys("yugr");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("789");
		driver.findElementById("createLeadForm_description").sendKeys("hello");
		driver.findElementById("createLeadForm_importantNote").sendKeys("impnote");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("22");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("233");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("3");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("233@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("ytr");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("ery");
		driver.findElementByName("generalAddress1").sendKeys("23thbsj");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("23tsj");
		driver.findElementById("createLeadForm_generalCity").sendKeys("cbe");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("cbe12");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("cbe435");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("789654123");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("erty");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("erfdhd.ert.com");
		WebElement sp = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select spdd = new Select(sp);
		spdd.selectByVisibleText("Alabama");
		WebElement cntry = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select cntrydd = new Select(cntry);
		cntrydd.selectByVisibleText("Afghanistan");
		String text = driver.findElementById("createLeadForm_firstName").getText();
		System.out.println(text);
		driver.findElementByClassName("smallSubmit").click();
		String title = driver.getTitle();
		String expTitle = "View Lead | opentaps CRM";
//		System.out.println(title);
		if (title.equals(expTitle)) {
			System.out.println("Page landed successfully");

		}
		driver.close();

	}

}
