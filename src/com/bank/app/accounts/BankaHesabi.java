package com.bank.app.accounts;
import java.util.Random;

public class BankaHesabi {
	//Protected kullanmamızın sebebi alt sınıfların erişmesi
    protected String iban;
    protected double bakiye;
    //Constructor metodu
    public BankaHesabi(double bakiye) {
        Random random = new Random();//Rastgele iban oluşturuyor
        this.iban = "TR" + (100000 + random.nextInt(900000));
        this.bakiye = bakiye;
    }
    //Hesaba para ekleme işlemi
    public void paraEkle(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL hesaba eklendi.");
    }
    //Hesaptan para çekme işlemi
    public void paraCek(double miktar) {
        if (miktar > bakiye) {//Yetersiz bakiye kontrolü
            System.out.println("Yetersiz bakiye!");
        } 
        else {
            bakiye -= miktar;
            System.out.println(miktar + " TL hesaptan çekildi.");
        }
    }
    //Iban bilgisini döndürüyor
    public String getIban() {
        return iban;
    }
    //Iban bilgisini değiştiriyor
    public void setIban(String iban) {
        this.iban = iban;
    }
    //Bakiye bilgisini döndürüyor
    public double getBakiye() {
        return bakiye;
    }
    //Bakiye bilgisini değiştiriyor
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    @Override
    public String toString() {
        return "IBAN: " + iban + " Bakiye: " + bakiye;
    }
}