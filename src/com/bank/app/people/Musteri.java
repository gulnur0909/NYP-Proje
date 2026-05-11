package com.bank.app.people;
import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
import java.util.ArrayList;
import java.util.Random;
//Kişi sınıfından miras alıyor
public class Musteri extends Kisi {
    private String musteriNumarasi;
    private ArrayList<BankaHesabi> hesaplar;//Müşteriye ait hesapların tutulduğu liste
    private ArrayList<KrediKarti> krediKartlari;//Müşteriye ait kredi kartların tutulduğu liste
    //Constructor
    public Musteri(
            String ad,
            String soyad,
            String email,
            String telefonNumarasi
    ) {
        super(ad, soyad, email, telefonNumarasi);
        Random random = new Random();//Random müşteri numarası
        this.musteriNumarasi = String.valueOf(10000 + random.nextInt(90000));
        //ArrayList nesneleri oluşturuyor
        hesaplar = new ArrayList<>();
        krediKartlari = new ArrayList<>();
    }
    //Hesap oluşturma işlemi
    public void hesapEkle(String hesapTuru) {
        if (hesapTuru.equalsIgnoreCase("Vadesiz")) {//Vadesiz hesap oluşturma
            VadesizHesap hesap = new VadesizHesap(0);
            hesaplar.add(hesap);
            System.out.println("Vadesiz hesap oluşturuldu.");
        } 
        else if (hesapTuru.equalsIgnoreCase("Yatirim")) {//Yatırım hesap oluşturma
            YatirimHesabi hesap = new YatirimHesabi(0);
            hesaplar.add(hesap);
            System.out.println("Yatırım hesabı oluşturuldu.");
        }
    }
    //Hesap silme işlemi
    public void hesapSil(BankaHesabi hesap) {
        if (hesap.getBakiye() > 0) {
            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        } 
        else {
            hesaplar.remove(hesap);//Hesap listeden silinir
            System.out.println("Hesap silindi.");
        }
    }
    //Kredi kartı oluşturma
     public void krediKartiEkle(double limit) {
        KrediKarti kart = new KrediKarti(limit, 0);
        krediKartlari.add(kart);
        System.out.println("Kredi kartı oluşturuldu.");
    }
     //Kredi kartı silme işlemi
    public void krediKartiSil(KrediKarti kart) {
        if (kart.getGuncelBorc() == 0) { 
        	krediKartlari.remove(kart);//kart listeden silinir
            System.out.println("Kredi kartı silindi.");
        } 
        else {
        	System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
        }
    }
    //Müşteri numarası döndürür
    public String getMusteriNumarasi() {
        return musteriNumarasi;
    }
    //müşteri numarası değiştirir
    public void setMusteriNumarasi(String musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
    //hesap listesi döndürür
    public ArrayList<BankaHesabi> getHesaplar() {
        return hesaplar;
    }
    //hesap listesi değiştirir
    public void setHesaplar(ArrayList<BankaHesabi> hesaplar) {
        this.hesaplar = hesaplar;
    }
    //kredi kartı listesi döndürür
    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }
    //kredi kartı listesi değiştirir
    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }
    @Override
    public String toString() {
        return super.toString() + " Müşteri No: " + musteriNumarasi;
    }

}