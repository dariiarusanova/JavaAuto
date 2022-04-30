package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AutomationPractiseTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://developers.google.com/search");
        //driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/section/main/devsite-content/article/div[2]/section[1]/div/div/div/div[2]/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Принципы работы Google Поиска")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/sc-survey-survey-manager/div/div[4]/sc-shared-material-button/div/button/span/sc-shared-material-icon/div")).click();
        driver.findElement(By.linkText("Руководство по работе с Поиском для разработчиков")).click();
        driver.findElement(By.cssSelector("#gc-wrapper > main > devsite-content > article > div.devsite-article-body.clearfix.devsite-no-page-title > devsite-bookmark > input")).click();
        driver.findElement(By.id("devsite-bookmark-dialog"));
        driver.findElement(By.linkText("Закрыть")).click();
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
}
