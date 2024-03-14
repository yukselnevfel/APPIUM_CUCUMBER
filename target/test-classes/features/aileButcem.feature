
Feature: Kullanici aile butcem gorevlerini gerceklestirir

  Background:
    * ilk ekran ayarlarini yapin 0 6 556 815 750 71 815 500 ve ardindan login "Giriş Yap" sayfasina ulasin
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
      | isim3 | soyisim3 | sehir3 | yas3 | meslek3 |

@ab
    Scenario:
      * anasayfadaki arti 533 1677 0 butonuna tiklayin
      * "Gelir Ekle" bolumune tiklayin
      * Gelir Ekle bolumunde "Ilk Gelir","Gelir Tipi","Düzensiz","Kategori" "Serbest Gelir",464, 1246, 1000 tarih 444, 1259, 1000 ve tutari "30000" belirleyin ve kaydedin
      * basariyla eklendigini dogrulayin
      * kullanici uygulamayi kapatir

@gider
    Scenario:
      * anasayfadaki arti 360 1419 0 butonuna tiklayin
      * "Gider Ekle" bolumune tiklayin
      * Gider Ekle sayfasinda "Açıklama" kısmına "aylık giderler" girin
      * Gider Ekle sayfasında "Gider Tipi" "Düzenli" olarak secin
      * Gider Ekle sayfasinda "Gider Periyodu" "Aylık" olarak secin
      * Gider Ekle sayfasinda Kategori 643 899 1000 tıklayın ve kategori tipi "Diğer" olarak secin
      * Gider Ekle sayfasında 2 ve "15" secimi yapilir
      * Gider Ekle sayfasında "Tutar" "3000" girilir
      * "Kaydet" buttonuna tıklanir
      * Basariyla kaydedildiği dogrulanir.
      * kullanici uygulamayi kapatir











