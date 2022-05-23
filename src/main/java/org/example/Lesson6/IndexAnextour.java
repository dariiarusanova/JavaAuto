package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexAnextour extends PageObjectMethods {
    public IndexAnextour(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href=\"/\"]")
    public WebElement Tours;
    //ТАБ ОТЕЛИ СЕЙЧАС НЕ РАБОТАЕТ, ПЕРЕКЛЮЧАЕТ НА ТУРЫ
    /*@FindBy(xpath = "//a[@href=\"/\"]")
    public WebElement Hotels;*/
    @FindBy(xpath = "//a[@href=\"/avia\"]")
    public WebElement Aviatickets;

    @FindBy(xpath = "//a[@href=\"https://www.anextour.com/excursion-tours/turkey/selectum-blue-cruises\"]")
    public WebElement Cruises;

}




