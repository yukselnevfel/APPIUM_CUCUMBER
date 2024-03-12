package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HesabimPage {
    public HesabimPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }
}
