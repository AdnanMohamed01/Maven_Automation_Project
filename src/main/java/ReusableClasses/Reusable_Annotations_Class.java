package ReusableClasses;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class Reusable_Annotations_Class {
    //set all global variables here with public static
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;
    
    //set Before suite for reports path 
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions_Loggers.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Reports/Automation.html",true);


    }//end of before suite

    //set after method to end the lagger
    
    
}
