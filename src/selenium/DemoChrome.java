package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;

public class DemoChrome {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver", "./software/ChromeDriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		
		
	}

}
