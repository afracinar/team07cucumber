@n11
  Feature: n11_arama_testi
    Scenario: n11_A_Harfli_Tum_Magazalar_Secimi
      Given kullanici "https://www.n11.com/" adresine gider
      When kullanici markalar butonuna tiklar
      Then kullanici A harfine tiklar
      And A harfindeki tum markalarin ismi excel "Sheet1" sayfasina yazdirilir
      And sayfa kapatilir
