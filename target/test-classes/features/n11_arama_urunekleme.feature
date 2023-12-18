#https://www.n11.com/ adresine gidilerek arama motorunda "kulaklik" kelimesi aratilir.
  #Gelen sonuclar yorum sayisina gore siralanir.
  #Gelen urunlerden ucretsiz kargo olanlar listelenir.
  #Gelen sonuclardan ilk sayfadaki birinci ve sonuncu urun sepete eklenir
  #Sepete gidilerek urunlerden en ucuzunun adedi 2 yapilir ve misafir kullanici olarak odeme adimina ilerlenir
  @n11_kulaklik
  Feature: n11 urun arama, ekleme
    Scenario: n11_kulaklik_arama
      Given kullanici "https://www.n11.com/" adresine gider
      When kullanici arama kutusuna kulaklik yazip arar
      Then kullanici sirala butonundan yorum sayisini secer
      Then kullanici ucretsiz kargo olanlari secip listeler
      And kullanici ilk sayfadaki birinci ve sonuncu urunu sepete ekler
      And kullanici sepete gider ucuz urunu 2 adet yapar
      And kullanici misafir olarak odemeye gecer