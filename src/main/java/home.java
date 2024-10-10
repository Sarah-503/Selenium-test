import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		driver.get("https://github.com/Sarah-503");
	}
}
