
package base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	

 public static Properties prop;
 public static WebDriver driver;
 
	public MainClass() {
		try {
		    prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\sadia\\eclipse-workspace\\CucumberBDDPom\\"
					                                 + "src\\main\\java\\properties\\config.properties");
			
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
        public void initialized() {
	    System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromeDriver"));
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Converting Value From String to Integer as properties file will store all value in String only
		String pageload = prop.getProperty("pageLoadTimeOut");
		int pageloadint =  Integer.valueOf( pageload );
		String implicitlyWait =  prop.getProperty("implicitlyWaitTimeOut");
		int implicitlyWaitint =  Integer.valueOf( implicitlyWait);
//		driver.manage().timeouts().pageLoadTimeout(Integer.valueOf(prop.getProperty("pageLoadTimeout")),
//	    TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout( pageloadint, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicitlyWaitint, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
}
		public void tearDown() {
		driver.close();

}
}
