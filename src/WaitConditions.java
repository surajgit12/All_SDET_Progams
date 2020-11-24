import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//https://sqa.stackexchange.com/questions/32780/how-to-find-the-last-element-in-a-list-of-the-same-images-on-a-website-using-pyt

public class WaitConditions {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\suraj.umbarkar\\Desktop\\CORE JAVA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println("size of list---> " + list.size());

		/*
		 * WebElement last_element = list.get(list.size()-2); 
		 * last_element.click();
		 */
		Iterator<WebElement> itr = list.iterator();

		while (itr.hasNext()) {

			WebElement str = itr.next();

			System.out.println(str.getText());
			

		}
		WebElement last_element = list.get(list.size()-1); 
		last_element.click();
		System.out.println(" User is able to click on second last link");

	}
}
