package com.bank.app.accounts;
import com.bank.app.cards.KrediKarti;
public class VadesizHesap extends BankaHesabi {//Hesap sınıfından miras almış
    private String hesapTuru = "Vadesiz";
    public VadesizHesap(double bakiye) {
        super(bakiye);
    }
	//Para transfer işlemi
    public void paraTransferi(BankaHesabi aliciHesap, BankaHesabi gonderenHesap, double miktar) {
        if (miktar > gonderenHesap.getBakiye()) {//Gönderen hesabın bakiyesi yetiyor mu diye kontrol ediliyor
            System.out.println("Yetersiz bakiye!");
        } 
        else {//Gönderebiliyorsa hesaptaki bakiye düşüyor
            gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
            aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
            System.out.println(miktar + " TL transfer edildi.");
        }
    }
    //Kredi kartının borcunu ödeme işlemi
    public void krediKartiBorcOdeme(KrediKarti kart, double miktar) {
        if (miktar > bakiye) {//Hesaptaki bakiye kontrol ediliyor
            System.out.println("Yetersiz bakiye!");
            return;
        }
        if (miktar > kart.getGuncelBorc()) {//Ödeme miktarının güncel borçtan büyük olup olmadığını kontrol ediyor
            System.out.println("Borçtan fazla ödeme yapılamaz!");
            return;
        }
        bakiye -= miktar;
        kart.setGuncelBorc(kart.getGuncelBorc() - miktar);//güncel borç azalıyor
        System.out.println("Kredi kartı borcu ödendi.");
    }
    @Override
    public String toString() {
        return super.toString() + ", Tür: " + hesapTuru;
    }
}
