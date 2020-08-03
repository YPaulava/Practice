import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// selenium code
		
		 // create a Driver object for Chrome browser
		
		// will strictly implement methods of webDriver
		
		/* Class name=ChromeDriver,
				
				x driver =new x(); */
		// invoke(вызывать) browser .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	
		//System.out.println(driver.getTitle());
	
		 
		
	}

}
  