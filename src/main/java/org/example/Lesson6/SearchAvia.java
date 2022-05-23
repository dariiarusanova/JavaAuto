package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchAvia extends PageObjectMethods {
    //https://www.anextour.com/avia
    public SearchAvia(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "select-id-airFrom19")
    public WebElement From;
    @FindBy(id = "select-id-airTo21")
    public WebElement To;
    @FindBy(id = "calendar-id-CHECKIN_BEGCHECKIN_END27")
    public WebElement CalendarOfFlights;
    @FindBy(xpath = "//*[@id=\"30\"]/div[1]/input")
    public WebElement Tourists;
    @FindBy(xpath = "//*[text()='Чартер']")
    public WebElement ButtonCharter;
    @FindBy(xpath = "//*[text()='GDS']")
    public WebElement ButtonGDS;
    @FindBy(xpath = "//*[text()='Найти']")
    public WebElement ButtonFind;

}


