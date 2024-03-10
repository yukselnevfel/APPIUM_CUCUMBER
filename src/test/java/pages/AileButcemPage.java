package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.logging.XMLFormatter;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);

    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public WebElement girisYapildiText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement soyisimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement sehirkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement yaskutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public WebElement meslekKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement aciklamaKutusu;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement TutarKutusu;






    public void bilgiSilme(){
        isimKutusu.clear();
        soyisimKutusu.clear();
        sehirkutusu.clear();
        yaskutusu.clear();
        meslekKutusu.clear();
    }

    public void textBoxVeriGirme(String isim,String soyisim,String sehir,String yas,String meslek){
        bilgiSilme();
        isimKutusu.sendKeys(isim);
        soyisimKutusu.sendKeys(soyisim);
        sehirkutusu.sendKeys(sehir);
        yaskutusu.sendKeys(yas);
        meslekKutusu.sendKeys(meslek);
        ReusableMethods.scrollWithUiScrollable("Kaydet");

    }

    public void textBoxKontrol(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimKutusu.getText().contains(isim));
        Assert.assertTrue(soyisimKutusu.getText().contains(soyisim));
        Assert.assertTrue(sehirkutusu.getText().contains(sehir));
        Assert.assertTrue(yaskutusu.getText().contains(yas));
        Assert.assertTrue(meslekKutusu.getText().contains(meslek));
    }


    public void ucCizgiTiklamaMethodu() throws InterruptedException {
        ReusableMethods.wait(4);
        ReusableMethods.koordinatTiklamaMethodu(113,135,500);
    }

    public void ilkEkranOrtakAdimlari(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme,String girisText) throws InterruptedException {
        ReusableMethods.wait(3);
        for (int i=for1; i<forSart; i++){
            ReusableMethods.scrollScreenMethod(x1,y1,wait,x2,y2,bekleme);

        }
        ReusableMethods.scrollWithUiScrollable(girisText);
    }



    public void ilkEkranAyarlamalari() throws InterruptedException {
        for (int i=0; i<6; i++){
            ReusableMethods.scrollScreenMethod(946,1005,750,150,1005,500);

        }
        ReusableMethods.scrollWithUiScrollable("Giriş Yap");
    }

}