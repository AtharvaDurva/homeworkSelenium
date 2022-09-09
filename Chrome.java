package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.uk/");

        System.out.println(driver.getTitle());

        String actual = driver.getTitle();
        System.out.println(actual);

        String expected = "Google";

         if(actual.equals(expected)){
           System.out.println("Test Pass");
        }
        else{
          System.out.println("Test Failed");
        }

    }
}
