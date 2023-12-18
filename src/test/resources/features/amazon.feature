#1. Tarayıcıyı başlatın
#2. 'http://automationexercise.com/' URL'sine gidin
#3. Ana sayfanın başarıyla göründüğünü doğrulayın
#4. 'Ürünler' düğmesini tıklayın
#5. İlk ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
#6. 'Alışverişe Devam Et' düğmesini tıklayın
#7. İkinci ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
#8. 'Sepeti Görüntüle' düğmesini tıklayın
#9. Her iki ürünün de Sepete eklendiğini doğrulayın
#10. Fiyatlarını, miktarlarını ve toplam fiyatlarını doğrulayın

  @amazon_test
  Feature: Amazonda sepete urun ekleme
    Scenario: amazon_sepete_urun_ekleme
      Given kullanici "https://www.amazon.com.tr" adresine gider
      When kullanici arama kutusuna "iphone" yazip arar
      Then kullanici ilk urune tiklar
      Then kullanici sepete ekle butonuna tiklar
      And kullanici ana sayfaya gider
      And kullanici ikinci urunu tiklar ve sepete ekler
      And kullanici sepete git butonuna tiklar
      And kullanici sepette iki urun oldugunu dogrular
      And kullanici urun fiyatlarini yazdirir ve dogrular
      And kullanici toplam fiyati yazdirir ve toplam fiyati dogrular