package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();
		driver.navigate().back();
		Point location = driver.findElementById("position").getLocation();
		System.out.println(location);
		String cssValue = driver.findElementById("color").getCssValue("color");
		System.out.println(cssValue);
		Dimension size = driver.findElementById("size").getSize();
		System.out.println(size);
		driver.close();
	}

}
