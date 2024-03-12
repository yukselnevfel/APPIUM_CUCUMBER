package stepdefinitions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.ReusableMethods;

import javax.xml.transform.sax.SAXResult;

public class aileButcem {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AileButcemPage aileButcemPage=new AileButcemPage();


    @Given("ilk ekran ayarlarini yapin {int} {int} {int} {int} {int} {int} {int} {int} ve ardindan login {string} sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme,String girisText) throws InterruptedException {
        // 946,1005 waitAction  150,1005
        ReusableMethods.wait(8);
        /*
        for (int i=for1; i<forSart; i++){
            ReusableMethods.scrollScreenMethod(x1,y1,wait,x2,y2,bekleme);

        }
        ReusableMethods.scrollWithUiScrollable(girisText);

         */
        //2.yol
        aileButcemPage.ilkEkranAyarlamalari();
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String sifre,String girisYap) {
        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(sifre));
        ReusableMethods.scrollWithUiScrollable(girisYap);
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue( aileButcemPage.girisYapildiText.isDisplayed());
        ReusableMethods.wait(5);

    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabim) throws InterruptedException {
      aileButcemPage.ucCizgiTiklamaMethodu();
      ReusableMethods.scrollWithUiScrollable(hesabim);

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String isim, String soyisim, String sehir, String yas,String meslek) {
        aileButcemPage.textBoxVeriGirme(ConfigReader.getProperty(isim),ConfigReader.getProperty(soyisim),ConfigReader.getProperty(sehir),ConfigReader.getProperty(yas),ConfigReader.getProperty(meslek));
        aileButcemPage.textBoxKontrol(ConfigReader.getProperty(isim),ConfigReader.getProperty(soyisim),ConfigReader.getProperty(sehir),ConfigReader.getProperty(yas),ConfigReader.getProperty(meslek));


    }
    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }

    //2.Senaryo
    @Given("anasayfadaki arti {int} {int} {int} butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin(int x,int y,int bekleme) throws InterruptedException {
        ReusableMethods.koordinatTiklamaMethodu(x,y,bekleme);
    }
    @Given("{string} bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin(String gelirText) {
        ReusableMethods.scrollWithUiScrollable(gelirText);
    }
    @Given("Gelir Ekle bolumunde {string},{string},{string},{string} {string},{int}, {int}, {int} tarih {int}, {int}, {int} ve tutari {string} belirleyin ve kaydedin")
    public void aciklama_gelir_tip_kategori_tarih_ve_tutari_belirleyin_ve_kaydedin(String ilkKutu,String gelirTipKutusu,String gelirTuru, String kategoriKutusu,String kategoriTuru,int xtakvim,int ytakvim, int bekleme,int xtarih,int ytarih,int wait,String tutar) throws InterruptedException {
        aileButcemPage.aciklamaKutusu.sendKeys(ilkKutu);
        ReusableMethods.scrollWithUiScrollable(gelirTipKutusu);
        ReusableMethods.wait(1);
        ReusableMethods.scrollWithUiScrollable(gelirTuru);
        ReusableMethods.scrollWithUiScrollable(kategoriKutusu );
        ReusableMethods.scrollWithUiScrollable(kategoriTuru);
        ReusableMethods.wait(1);
        ReusableMethods.koordinatTiklamaMethodu(xtakvim,ytakvim,bekleme);
        aileButcemPage.nextMontIconu.click();
        ReusableMethods.wait(1);
        ReusableMethods.koordinatTiklamaMethodu(xtarih,ytarih,wait);
        aileButcemPage.takvimOkButtonu.click();
        ReusableMethods.wait(1);
        aileButcemPage.biletTutarKutusu.sendKeys(tutar);
        ReusableMethods.wait(1);
        aileButcemPage.biletKayitButtonu.click();
        ReusableMethods.wait(2);

    }
    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {
       Assert.assertTrue( aileButcemPage.gelirEklendiText.isDisplayed());



    }


}
