package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserPath("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[contains(text(),'you')]"));
		driver.findElementByXPath("//label[@for='yes']").click();
		System.out.println(driver.findElementByXPath("//label[@for='yes']").isEnabled());
		if (driver.findElementByXPath("//label[@for='yes']").isEnabled()) {
			System.out.println("Selected YES");
		}
	}

}
