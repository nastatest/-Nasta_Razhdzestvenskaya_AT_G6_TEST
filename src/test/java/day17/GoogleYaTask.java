package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleYaTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("https://ya.ru/");
        driver.navigate().back();
        driver.navigate().refresh();
    }
}

