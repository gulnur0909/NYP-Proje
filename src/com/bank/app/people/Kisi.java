package com.bank.app.people;
/*Bu sınıfta kişilerin özellikleri bulunuyor.*/
public class Kisi {
	//Protected kullanmamızın sebebi alt sınıfların erişmesi
    protected String ad;
    protected String soyad;
    protected String email;
    protected String telefonNumarasi;
    //Constructor
    public Kisi(String ad, String soyad, String email, String telefonNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }
    //Ad bilgisini döndürüyor
    public String getAd() {
        return ad;
    }
    //Ad bilgisini değiştiriyor
    public void setAd(String ad) {
        this.ad = ad;
    }
    //Soyad bilgisini döndürüyor
    public String getSoyad() {
        return soyad;
    }
    //Soyad bilgisini değiştiriyor
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //Telefon numarası döndürüyor
    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }
    //Telefon numarasi değiştiriyor
    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
    @Override
    public String toString() {
        return "Ad: " + ad + " Soyad: " + soyad + " Email: " + email + " Tel: " + telefonNumarasi;
    }
}