package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions_Googlesearch {
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
        WebDriver driver = new ChromeDriver();
        //go to google home page
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        //maximize the driver
        driver.manage().window().maximize();
        //locate element for search field amd type keyword 'cars'
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(2500);
        //capture the google search and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("Result is + searchResults");
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        String replaceParanth = arrayResult[3].replace("(","").replace(")","");
        System.out.println("My search number is " + arrayResult[1]);
        driver.quit();
        Thread.sleep(3000);







    }//end of main
}//end of java
