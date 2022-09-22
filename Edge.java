package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\software\\Driver\\msedgedriver.exe");  //edgedriv


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Test27@unify.co.uk");
        driver.findElement(By.id("Password")).sendKeys("abc12");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("button[class=\"button-1 search-box-button\"]")).click();









    }
}
