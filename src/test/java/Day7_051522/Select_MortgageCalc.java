package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {

    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options argument
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize your driver
        options.addArguments("start-maximized");
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //select start month from the dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name= 'param[start_month]']"));
        //define select command
       // Select dropDown = new Select(startMonth);
        //select by visible text
        //dropDown.selectByVisibleText("June");

        //clicking on dropDown and its value if the dropdown tag is not under select tag
        startMonth.click();
        //clicking on value of the start month
        driver.findElement(By.xpath("//*[text()= 'Jun']")).click();


        //select Loan Type from the dropdown
        WebElement LoanType = driver.findElement(By.xpath("//*[@name= 'param[milserve]']"));
        //define select command
        Select LoanTypeDropdown = new Select(LoanType);
        //select by visible text
        LoanTypeDropdown.selectByVisibleText("FHA");





    }//end of main
}//end of class
