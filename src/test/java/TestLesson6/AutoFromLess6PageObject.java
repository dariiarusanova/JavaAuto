package TestLesson6;

import TestLesson5.AutoForLes5test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Lesson6.IndexAnextour;
import org.example.Lesson6.PageObjectMethods;
import org.example.Lesson6.SearchAvia;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoFromLess6PageObject extends IndexAnextour {
    public AutoFromLess6PageObject(WebDriver driver, IndexAnextour indexAnextour, SearchAvia searchAvia) {
        super(driver);
        this.indexAnextour = indexAnextour;
        this.searchAvia = searchAvia;
    }

    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
        WebDriverManager.chromedriver().setup();
    }

    public IndexAnextour indexAnextour;
    public SearchAvia searchAvia;


    @BeforeEach
    void initDriver() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.anextour.com/");
    }

    @Test
    @DisplayName("Try to see all tickets from Saint-Petersburg")
    void TryToFindTicketsSpbAntalya() {
        new IndexAnextour(driver).Aviatickets.click();
        actions.click(new SearchAvia(driver).From).wait(ExpectedConditions.visibilityOfElementLocated(By.id("select-id-airFrom19")).
                andThen(actions.click(By.xpath("//*[text()='Санкт-Петербург (Любой)']")
                        .wait(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Санкт-Петербург (Любой)']"))
                                .andThen(actions.click(new SearchAvia(driver).ButtonFind)
                                        .build().perform();
        Assertions.assertEquals(driver.findElement(By.id("//*[@id=\"__next\"]/main/div[1]/section/div[3]")).isDisplayed(), true);

    }

    @AfterEach
    void DriverQuit() {
        driver.quit();
    }

    private static final Logger logger = LoggerFactory.getLogger(AutoForLes5test.class);


}
