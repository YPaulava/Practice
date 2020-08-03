import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
		
				 // create a Driver object for FireFoxbrowser
				
				// will strictly implement methods of webDriver
				
				/* Class name=FirefoxDriver,
						
						x driver =new x(); */
				// invoke(вызывать) Browser .exe file first
		// gecko driver
				 System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
	}

}
