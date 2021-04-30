package definitions;

import Base.ClaseBase;
import browserManager.DriverManager;
import browserManager.DriverManagerFactory;
import browserManager.DriverType;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver driver;
    private static DriverManager driverManager;

    @Before
    public void setUp(){

        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        ClaseBase.initPage();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        driver.quit();

    }

    public static WebDriver getDriver(){
        return driver;
    }


}
