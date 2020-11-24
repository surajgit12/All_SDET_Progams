import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverTest {

	public static void main(String[] args) {
	
	// FIRFOX DRIVER >> Gekodriver is class in selenium we have to create obj
		
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\suraj.umbarkar\\Desktop\\CORE JAVA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			
			System.out.println("correct");
		}

		else {
			System.out.println("not");
		}
	/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suraj.umbarkar\\Desktop\\CORE JAVA\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		*/
	}

}
