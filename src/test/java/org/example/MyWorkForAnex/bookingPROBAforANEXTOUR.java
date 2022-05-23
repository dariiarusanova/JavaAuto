package org.example.MyWorkForAnex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.AnextourAutorisation.Authorization;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class bookingPROBAforANEXTOUR {
    WebDriver driver;
    WebDriverWait webDriverWait;
    //Actions actions = new Actions(driver);

    @BeforeAll
    static void Start() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();

    }

    public Authorization authorization;

    public bookingPROBAforANEXTOUR(WebDriver driver) {
        this.driver = driver;
    }

   /* @Test
    @DisplayName("Авторизуемся как testweb")
    void Open() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://agent.anextour.com/");
        new Authorization(driver).Agent("testweb", "KS23eg65");
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        //actions.click
        Assertions.assertEquals(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/ul")).isDisplayed(), true);

    }*/

    @AfterAll
    void Out() {
        driver.quit();
    }
}
