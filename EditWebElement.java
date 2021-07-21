package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		WebElement element = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		element.sendKeys("abcd",Keys.TAB);
		String text = driver.findElementByName("username").getAttribute("value");
		System.out.println("text "+text);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
	     driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
//		boolean enabled = driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();

//		System.out.println(enabled);
		if ( driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled()==false) {
			System.out.println("The edit field is disabled");
		}
		driver.close();
	}

}
