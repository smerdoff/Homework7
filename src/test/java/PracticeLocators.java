import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeLocators {

    @Test
    public void findLocators(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.tut.by/account/signup?backurl=%2F");
        driver.findElements(By.name("firstName"));
        driver.findElement(By.className("bloko-button_large"));
        driver.findElements(By.partialLinkText("account/login?backurl=%2F"));
        driver.findElements(By.linkText("https://jobs.tut.by/account/login?backurl=%2F"));
        driver.findElements(By.tagName("button"));
        driver.findElement(By.cssSelector(".supernova-link"));
        driver.findElement(By.cssSelector(".supernova-link.HH-Supernova-NaviLevel2-Link"));
        driver.findElement(By.cssSelector("*"));
        driver.findElement(By.cssSelector("button"));
        driver.findElement(By.cssSelector("button.bloko-button_large"));
        driver.findElement(By.cssSelector("div.supernova-navi-item a"));
        driver.findElement(By.cssSelector("div, p"));
        driver.findElement(By.cssSelector("div.bloko-form-item > input"));
        driver.findElement(By.cssSelector("div.bloko-form-item > input"));
        driver.findElement(By.cssSelector("[type]"));
        driver.findElement(By.cssSelector("[name=firstName]"));
        driver.findElement(By.cssSelector("a[href^='https']"));
        driver.findElement(By.cssSelector("a[href$='login?backurl=%2F']"));
        driver.findElement(By.cssSelector("a[href*='login']"));
        driver.findElement(By.xpath("//div/a"));
        driver.findElement(By.xpath("//*/a"));
        driver.findElement(By.xpath("//*[text()='Фамилия']/../..//input"));
        driver.findElement(By.xpath("(//*//input)[6]"));
        List <WebElement> listOfInputs = driver.findElements(By.xpath("//*//input"));
        WebElement firstName = listOfInputs.get(4);
        driver.findElement(By.xpath("//input[@name='firstName']"));
        driver.findElement(By.xpath("//*[text()='Поиск']/../../..//button"));
        driver.quit();
    }
}
