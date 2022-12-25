<p align="center">
  <img src="https://user-images.githubusercontent.com/107454207/209460451-dc03dfdc-7cbe-4b54-b11a-fd822b11b6be.png"/>
</p>

<h3>Dizayn</h3>

Page Object Model anlayışına uygun şekilde hazırlanan yapı, site üzerindeki fonksiyonların gerçekleştirildiği kısım ve
test işlemlerinin gerçekleştirildiği kısım olmak üzere 2 bölümden oluşmaktadır.

- Aşağıdaki resimde görüldüğü üzere, web sitesi, PageObjects klasörü içinde 4 sınıfa ayrılmıştır.
  - <b>Login</b> sınıfında, kullanıcı girişi için gerekli metodları bulundurmaktadır.
  - <b>Dashboard</b> sınıfında, etkinlik oluşturma ve mevcut etkinlikleri düzenleme, silme, görme gibi işlemleri yapan metodlar vardır.
  - <b>EventAssert</b> sınıfında, etkinlik ile ilgili doğrulamaları yapabilmemiz için metodlar tanımlanmıştır.
  - <b>EventInfo</b> sınıfında, etkinlik bilgilerini girebilmemiz için gerekli metodlar vardır.
  - <b>Components</b> paketindeki sınıflarda ise bu ana sınıflar için yardımcı ögeler bulunmaktadır.

<p align="center">
 <img src="https://user-images.githubusercontent.com/107454207/209474582-28b29cb7-6f79-45d1-a207-ecaf803e91f1.png"/>
</p>

- Bu kısım testlerle alakalıdır.
    - <b>TestComponents</b> paketindeki sınıflarda, driver'ın ayağa kaldırılması, config.properties dosyasının okunması, testin başarısız olması durumunda ekran görüntüsü alma, log ve raporlama işlemlerinin yapılması gibi fonksiyonlar bulunmaktadır. 
    - <b>Tests</b> paketindeki sınıflarda ise istenen senaryolara uygun testler bulunmaktadır.

<p align="center">
 <img src="https://user-images.githubusercontent.com/107454207/209474671-95b3e5c2-ac55-4224-9832-d26e1900503f.png"/>
</p>

<h3>Kullanılan Teknolojiler</h3>

Programlama dili olarak Java, test otomasyonu için Selenium WebDriver ve TestNG, projeyi oluşturmak için ise Maven kullanılmıştır.

<h3> 💻 Çalıştırma </h3>

1. seçenek olarak proje TestNG kütüphanesi ile oluşturulduğu için testng.xml dosyası üzerinden testler yürütülebilir.

2. seçenek olarak ise Maven ile testleri gerçekleştirmek için terminale `mvn test -PPitonE2EAssessment` kodunu yazmak yeterlidir.
---


Raporlama için ExtentReport kullanılmıştır. Rapor ***index.html*** dosya adı ile ***reports*** klasörü içinde bulunmaktadır.
Ayrıca testin başarısız olması durumunda alınan ekran görüntüleri yine bu klasöre kaydedilmektedir.


<p align="center">
 <img src="https://user-images.githubusercontent.com/107454207/209475510-7c2b2abc-37c8-4cec-bb33-d77338679e00.png"/>
</p>

Ayrıca raporlama için log4j vardır. ***application.log*** dosya adı ile ***Log4j*** klasörü içinde bulunmaktadır.

<p align="center">
 <img src="https://user-images.githubusercontent.com/107454207/209475567-81f35ead-2db4-417d-9d1a-229a6fb398e6.png"/>
</p>


