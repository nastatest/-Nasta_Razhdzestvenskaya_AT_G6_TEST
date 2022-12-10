package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement el = driver.findElement(By.name("q"));
        el.click();
        el.sendKeys("погода минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@role='listbox'][1]//li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='button']/div[text() = 'Mon']")).click();
        Thread.sleep(1000);
    }
}
