package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;
import utilities.Driver;

public class ObiletPage {
    public ObiletPage(){
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "//button[@aria-label='Menü']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[@class='language']")
    public WebElement languageButton;
    @FindBy(xpath = "(//a[@data-language='tr-TR'])[1]")
    public WebElement turkisLanguage;
    @FindBy(xpath = "//a[@id='currency-modal-btn']")
    public WebElement currencySelect;
    @FindBy(xpath = "(//a[@data-code='TRY'])[1]")
    public WebElement turkishLira;
    @FindBy(xpath = "//button[@id='search-button']")
    public WebElement searchButton;
    @FindBy(xpath = "(//span[@class='amount-sign'])[1]")
    public WebElement priceTypeResult;
}
