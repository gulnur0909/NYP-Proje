package com.bank.app.people;
import java.util.ArrayList;
import java.util.Random;
public class BankaPersoneli extends Kisi {//Kişi sınıfından miras almış
    private String personelID;
    private ArrayList<Musteri> musteriler;
    //Constructor metodu
    public BankaPersoneli(
            String ad,
            String soyad,
            String email,
            String telefonNumarasi) 
    {
        super(ad, soyad, email, telefonNumarasi);//Üst sınıf constructor çağırır
        Random random = new Random();//Rastgele personel ID oluşturur
        this.personelID = String.valueOf(1000 + random.nextInt(9000));
        musteriler = new ArrayList<>();//Müşteri listesi oluşturur
    }
    //müşteri ekleme işlemi
    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
        System.out.println("Müşteri personel listesine eklendi.");
    }
    //Personel ID bilgisi döndürüyor
    public String getPersonelID() {
        return personelID;
    }
    //Personel ID bilgisi değiştiriyor
    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }
    //Müşteri listesi döndürüyor
    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }
    //Müşteri listesi değiştiriyor
    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }
    @Override
    public String toString() {
        return super.toString() + " Personel ID: " + personelID;
    }
}