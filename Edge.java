package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\software\\Driver\\msedgedriver.exe");  //edgedriv
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.co.uk/");

        System.out.println(driver.getTitle());


    }
}
