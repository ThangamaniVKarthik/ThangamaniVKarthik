package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		driver.get("http://leafground.com/pages/Button.html");
		driver.navigate().back();
		driver.findElementByLinkText("Verify am I broken?").click();
		WebElement element = driver.findElementByXPath("//h1");
		if (element.getText().contains("404")) {
			System.out.println("Broken");
		}
		driver.navigate().back();
		driver.findElementByLinkText("Go to Home Page").click();
		
		}

	}


