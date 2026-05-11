package com.bank.app.accounts;
public class YatirimHesabi extends BankaHesabi {//Hesap sınıfından miras almış
    private String hesapTuru = "Yatirim";
    public YatirimHesabi(double bakiye) {
        super(bakiye);
    }
    @Override // Hesap sınıfındakş paraEkle metoduna overriding yapılmıştır
    public void paraEkle(double miktar) {
        bakiye += miktar;
        System.out.println("Yatırım hesabına para eklendi.");
    }
    @Override //Hesap sınıfındaki paraCek metoduna overriding yapılmıştır
    public void paraCek(double miktar) {
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } 
        else {
            bakiye -= miktar;
            System.out.println("Yatırım hesabından para çekildi.");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Tür: " + hesapTuru;
    }
}