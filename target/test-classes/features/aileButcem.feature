@abu
Feature: Kullanici aile butcem gorevlerini gerceklestirir

  Background:
    * ilk ekran ayarlarini yapin 0 6 946 1005 750 150 1005 500 ve ardindan login "Giriş Yap" sayfasina ulasin
    * "email" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap" giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario Outline: Kullanici verilen gorevler uzerinden test gorevlerini yerine getirir
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisikleri kaydedin ve dogrulayin
    * kullanici uygulamayi kapatir
    Examples:
      | isim  | soyisim  | sehir  | yas  | meslek  |
      | isim1 | soyisim1 | sehir1 | yas1 | meslek1 |
      | isim2 | soyisim2 | sehir2 | yas2 | meslek2 |
      | isim3 | soyisim3 | sehir3 | yas3 | meslek3       |











