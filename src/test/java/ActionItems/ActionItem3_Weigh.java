package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem3_Weigh {
    public static void main(String[] args) throws InterruptedException {

        //create an arrayList for zipcodes and loop/iterating through all the values using for loop
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11204");
        zipcode.add("11229");
        zipcode.add("11223");
        for (int i = 0; i < zipcode.size(); i++){
            System.out.println("My zipcode is " + zipcode.get(i));
        }// end of for loop

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
        //navigate to weight watcher site
        driver.navigate().to("https://www.weightwatcher.com");
        Thread.sleep(3000);
        try {
            WebElement attendButton = driver.findElement(By.xpath("//*[@da-label = 'Attend']"));
            attendButton.click();
        }
        catch (Exception e){
            //print out the exception
            System.out.println("Unable to click on attend dropdown" + e);
        }

        //click on ultimate workshops
        try {
            driver.findElement(By.xpath("//*[@data-e2e-name= 'unlimited_workshops']")).click();

        }
        catch (Exception e){
            //print out the exception
            System.out.println("Unable to click on ultimate workshop");
        }
        //click on studio exception









    }//end of main
}//end of class
