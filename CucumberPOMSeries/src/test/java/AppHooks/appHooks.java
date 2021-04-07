package AppHooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.internal.ConfigurationGroupMethods;

import com.qa.factory.DriverFactory;
import com.util.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class appHooks {
	
	private DriverFactory driverfactory;
	private WebDriver driver;
	private configReader reader;
	Properties prop;
	@Before(order=0)
	
	public void getproperty() throws IOException
	{
		reader=new configReader();
		prop=reader.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser()
	{
		String browsername=prop.getProperty("browser");
		driverfactory=new DriverFactory();
		driver=driverfactory.init_driver(browsername);
	}
	
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	
		public void tearDown(Scenario scenario)
		{
			if(scenario.isFailed())
			{
				//take screen shot
				String screenshotname=scenario.getName().replaceAll(" ", "_");
			byte[]sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotname);
				
			}
		}
	}


