package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement webElement = driver.findElementById("dropdown1");
		Select dd1 = new Select(webElement);
		dd1.selectByIndex(2);
		WebElement webElement2 = driver.findElementByName("dropdown2");
		Select dd2 = new Select(webElement2);
		dd2.selectByVisibleText("Appium");
		WebElement webElement3 = driver.findElementById("dropdown3");
		Select dd3 = new Select (webElement3);
		dd3.selectByValue("2");
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select").sendKeys("Appium");
//		WebElement webElement4 = driver.findElementByXPath("(//select)[6]");
		Select dd4 = new Select(driver.findElementByXPath("(//select)[6]"));
		dd4.selectByIndex(2);
		driver.close();
		

	}

}
