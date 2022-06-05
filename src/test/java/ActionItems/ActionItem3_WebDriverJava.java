package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem3_WebDriverJava {
    public static void main(String[] args) throws InterruptedException {
        //set chrome options argument
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize your driver
        options.addArguments("start-maximized");
        //setting your driver as headless(running on background)
        //options.addArguments("headless");
//setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);
        //capture search number and print following cities using arraylist and for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Staten Island");
        for (int i = 0; i < cities.size(); i ++){
            //go to bing home page
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);
            //maximize the driver
            driver.manage().window().maximize();
            //locate element for search field amd type keyword 'cars'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities.get(i));
            //submit on bing search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
            Thread.sleep(2500);
            //capture the bing search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='sb_form_q']")).getText();
            System.out.println("Result is + searchResults");
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            // String replaceParanth = arrayResult[3].replace("(","").replace(")","");
            System.out.println("My search number for city " + cities.get(i) + "is"  + arrayResult[1]);
            Thread.sleep(2000);

        }//end of forLoop
        driver.quit();






    }//end of main
}//end of class



