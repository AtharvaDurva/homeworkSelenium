package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\software\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.co.uk/");

        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");



    }
}
