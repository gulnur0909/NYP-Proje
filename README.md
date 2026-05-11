Banka Simülasyon Sistemi
BLM0121 Nesneye Yönelik Programlama dersi kapsamında geliştirilen bir banka simülasyonudur.
Proje Hakkında
Bu proje, bir bankanın temel işleyişini Java kullanarak modeller. Nesne Yönelik Programlama'nın (OOP) temel taşları olan kalıtım, kapsülleme ve 
çok biçimlilik prensipleri üzerine inşa edilmiştir. Sistem; müşteri ve personel yönetimi, vadesiz/yatırım hesap işlemleri ve kredi kartı süreçlerini kapsamaktadır.


Sınıf Yapısı
people: Kisi, Musteri ve BankaPersoneli sınıflarını içerir. Kişisel verileri ve kullanıcı rollerini yönetir.
accounts: BankaHesabi, VadesizHesap ve YatirimHesabi sınıflarını içerir. Para çekme, yatırma ve transfer işlemlerini yönetir.
cards: KrediKarti sınıfını içerir. Kart limit ve borç süreçlerini takip eder.
service: BankaService sınıfı ile sistem mesajlarını merkezi olarak yönetir.
main: Uygulamanın giriş noktası olan Main sınıfını içerir.


Temel Özellikler
Otomatik Veri Üretimi: Her hesap için rastgele IBAN, her müşteri için benzersiz Müşteri Numarası oluşturulur.
Para Transferi: Vadesiz hesaplar üzerinden başka hesaplara güvenli bakiye aktarımı.
Kredi Kartı Yönetimi: Kart tanımlama, limit kontrolü ve hesap bakiyesiyle borç ödeme sistemi.
Güvenlik Kontrolleri: Borcu olan kartın silinememesi veya bakiyesi yetersiz işlemlerin engellenmesi gibi mantıksal doğrulamalar.
OOP Prensipleri: @Override mekanizması ile farklı hesap türlerine özel işlem mesajları.


Kullanılan Teknolojiler
Dil: Java 21 (JDK 21)
Koleksiyonlar: Dinamik veri saklama için ArrayList kullanımı.
Giriş/Çıkış: Konsol tabanlı kullanıcı etkileşimi için Scanner.


Çalıştırma
Bilgisayarınızda JDK 21 veya üzeri bir sürümün kurulu olduğundan emin olun.

