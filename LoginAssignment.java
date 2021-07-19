package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
//		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		driver.findElementByXPath("//button[contains(text(),'Login')]").click();
//		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Log Out").click();
		driver.close();
	}

}
