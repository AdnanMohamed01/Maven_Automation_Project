package Day8_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Hotels_InClass {
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
        //navigate to mortgagecalculator site
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(3000);

        //arraylist for locations
        ArrayList<String> locations = new ArrayList<>();
        locations.add("california");
        locations.add("new jersey");
        locations.add("texas");
        for (int i = 0; i < locations.size(); i++) {



            try {
                WebElement searchBox = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
                searchBox.click();
                Thread.sleep(2000);
                WebElement searchInput = driver.findElement(By.xpath("//*[@id='location-field-destination']"));
                searchInput.click();
                searchInput.sendKeys(locations.get(0));
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("Unable to add a location " + e);
            }

            try {
                WebElement searchOption1 = driver.findElements(By.xpath("//*[@class='uitk-typeahead-button-label truncate']")).get(0);
                searchOption1.click();
            } catch (Exception e) {
                System.out.println("" + e);
            }
            try {
                WebElement checkIn = driver.findElement(By.xpath("//*[@id='d1-btn']"));
                checkIn.click();
                Thread.sleep(1500);
                driver.findElement(By.xpath("//*[@aria-label='Jun 17, 2022']")).click();
                driver.findElement(By.xpath("//*[@aria-label='Jun 24, 2022']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']")).click();
                //click on Travelers
                driver.findElement(By.xpath("//*[@aria-label='1 room, 2 travelers']")).click();
            }//
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //click + adult twice
                WebElement adults = driver.findElement(By.xpath("//*[@aria-label='Increase adults in room 1']"));
                adults.click();
                adults.click();
                Thread.sleep(1000);
//click done
                driver.findElement(By.xpath("//*[@data-testid='guests-done-button']")).click();
                Thread.sleep(1000);


                //click search
                driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();

                // store the different options as web element
                WebElement hotels = driver.findElement(By.xpath("//*[@data-stid='open-hotel-information]"));

                if (locations.get(i) == locations.get(0)) {
                    hotels.click();
                    System.out.println("Unable to");
                }
            }//end of for loop



        }//end of class
    }//end of main

