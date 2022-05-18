package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoForLes5test {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver() {
        logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get("https://www.anextour.com/");
    }

    @Test
    @DisplayName("Only try to see the full wisard")
    void AviaSearchWisardOpenTest() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder=\"Откуда\"]")));
        driver.findElement(By.xpath("//a[@href=\"/avia\"]")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id=\"select-id-airFrom19\"]")));
        driver.findElement(By.id("//*[@id=\"select-id-airFrom19\"]")).click();
        Assertions.assertEquals(driver.findElement(By.id("driver.quit();")).isDisplayed(), true);
    }
    @Test
    @DisplayName("Try to see all tickets from Saint-Petersburg")
    void TryToFindTicketsSpbAntalya(){
        Actions actions = new Actions(driver);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder=\"Откуда\"]")));
         actions.click(driver.findElement(By.xpath("//a[@href=\"/avia\"]")))
                 .wait(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select-id-airFrom19\"]"))
                 .andThen(actions.click(By.xpath("//*[text()='Санкт-Петербург (Любой)']")
                 .wait(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Санкт-Петербург (Любой)']"))
                 .andThen(actions.click(driver.findElement(By.xpath("//*[text()='Найти']")))
                 .build().perform();
       Assertions.assertEquals(driver.findElement(By.id("//*[@id=\"__next\"]/main/div[1]/section/div[3]")).isDisplayed(),true);
    }

    @AfterEach
    void DriverQuit() {
        driver.quit();
    }
    private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);

}


