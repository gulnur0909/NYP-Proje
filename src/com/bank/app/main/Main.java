package com.bank.app.main;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Musteri;
import com.bank.app.people.BankaPersoneli;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//Kullanıcıdan veri almak için Scanner nesnesi oluşturulur
        Scanner scanner = new Scanner(System.in);
        BankaPersoneli personel = new BankaPersoneli("Ece", "Yıldırım", "ece@banka.com", "05551112233");
        Musteri musteri = new Musteri("Gülnur", "Minaz", "gulnur@email.com", "05123456789");
        personel.musteriEkle(musteri);
        System.out.println("\nKişi Bilgileri");
        System.out.println("Personel: " + personel.toString());
        System.out.println("Müşteri: " + musteri.toString());
        VadesizHesap hesap = null;//Başlangıçta hesap oluşturulmadığı için null atanır
        KrediKarti kart = null;//Başlangıçta kart oluşturulmadığı için null atanır
        int secim = 0;
        while (secim != 7) {//Çıkış yapılana kadar devam eder
        	//Menü
            System.out.println("\n-----BANKA OTOMASYONU-----");
            System.out.println("1- Hesap Aç");
            System.out.println("2- Para Yatır");
            System.out.println("3- Para Çek");
            System.out.println("4- Para Transferi");
            System.out.println("5- Kredi Kartı Oluştur");
            System.out.println("6- Kart Borcu Öde");
            System.out.println("7- Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            switch (secim) {//Seçime göre işlem yapılır
                case 1://Hesap oluşturma işlemi
                    musteri.hesapEkle("Vadesiz");
                    hesap = (VadesizHesap) musteri.getHesaplar().get(0);
                    System.out.println("Hesap başarıyla açıldı.");
                    break;
                case 2://Hesaba para yatırma işlemi
                    if (hesap == null) {
                        System.out.println("Önce hesap açınız!");
                    } 
                    else {
                        System.out.print("Yatırılacak miktar: ");
                        double miktar = scanner.nextDouble();
                        hesap.paraEkle(miktar);
                    }
                    break;
                case 3://Hesaptan para çekme işlemi
                    if (hesap == null) {
                        System.out.println("Önce hesap açınız!");
                    } 
                    else {
                        System.out.print("Çekilecek miktar: ");
                        double miktar = scanner.nextDouble();
                        hesap.paraCek(miktar);
                    }
                    break;
                case 4://Para transferi işlemi
                    if (hesap == null) {
                        System.out.println("Önce hesap açınız!");
                    } 
                    else {
                        VadesizHesap aliciHesap = new VadesizHesap(0);
                        System.out.print("Transfer miktarı: ");
                        double miktar = scanner.nextDouble();
                        hesap.paraTransferi(aliciHesap, hesap, miktar);
                    }
                    break;
                case 5://Kredi kartı oluşturma işlemi
                    System.out.print("Kart limiti girin: ");
                    double limit = scanner.nextDouble();
                    musteri.krediKartiEkle(limit);
                    kart = musteri.getKrediKartlari().get(0);
                    // Test için borç ataması
                    kart.setGuncelBorc(limit * 0.2);
                    System.out.println("Kart tanımlandı: " + kart.toString());
                    break;
                case 6://Kart borcu ödeme işlemi
                    if (kart == null || hesap == null) {
                        System.out.println("Önce hesap ve kart oluşturunuz!");
                    } 
                    else {
                        System.out.println("Mevcut Borç: " + kart.getGuncelBorc());
                        System.out.print("Ödeme miktarı: ");
                        double miktar = scanner.nextDouble();
                        hesap.krediKartiBorcOdeme(kart, miktar);                     
                    }
                    break;
                case 7://Çıkış
                    System.out.println("Program kapatılıyor...");
                    break;
                default://Menüdeki seçimlere uygun bir seçim seçmezse uyarı veriyor
                    System.out.println("Geçersiz seçim!");
            }
        }
        scanner.close();//Scanner kapatılıyor
    }
}