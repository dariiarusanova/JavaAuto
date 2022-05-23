package org.example.AnextourAutorisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autorisation {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    @FindBy(id = "login_Логин")
    public WebElement Login;
    @FindBy(id = "password_Пароль")
    public WebElement Pswd;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ButtonIn;

    public Autorisation(WebDriver driver) {
    }
public void Agent(String login, String password){
        Login.sendKeys(login);
        Pswd.sendKeys(password);
        ButtonIn.click();
}
    public void LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
