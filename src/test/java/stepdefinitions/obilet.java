package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserDriver;

public class obilet {
    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String url) {
        BrowserDriver.getBrowserDriver().get(url);

    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {

    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {

    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {

    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir() {

    }

}
