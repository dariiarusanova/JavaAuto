package org.example.MyWorkForAnex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.AnextourAutorisation.Autorisation;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class bookingPROBAforANEXTOUR {
    WebDriver driver;
    WebDriverWait webDriverWait;
    //Actions actions = new Actions(driver);

    @BeforeAll
    static void Start() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();

    }

    @Test
    @DisplayName("Авторизуемся как testweb")
    void Open() {
        driver.get("https://agent.anextour.com/");
        new Autorisation(driver).Agent("testweb","KS23eg65");
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        //actions.click*/
        Assertions.assertEquals(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/ul")).isDisplayed(), true);

    }
    @AfterAll
    void Out() {
        driver.quit();
    }
}
