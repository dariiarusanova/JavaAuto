package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
//import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class SetupDriverExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("user-agent=Googlebot/2.1 (+https://www.google.com.html)");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://ya.ru");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }


}
