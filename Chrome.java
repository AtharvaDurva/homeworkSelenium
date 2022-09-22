package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
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
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// implicitli syntax
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.className("forcheckbox")).click();
        driver.findElement(By.id("FirstName")).sendKeys("abcd");
        driver.findElement(By.id("LastName")).sendKeys("wxyz");
        WebDriverWait wait =new WebDriverWait(driver,20);// expicit syntax
        Thread.sleep(5000);
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("16");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1965");
        driver.findElement(By.id("Email")).sendKeys("Test13@unify.co.uk");
        driver.findElement(By.id("Company")).sendKeys("Unify");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("qwerty");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("qwerty");
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(5000);
        driver.quit();










    }
}
