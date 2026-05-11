package com.bank.app.cards;
import java.util.Random;
/*Kredi kartı bilgileri (kart numarası, limiti ve güncel borç bilgileri bulunur)*/
public class KrediKarti {
    private String kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;
    //Constructor
    public KrediKarti(double limit, double guncelBorc) {
        Random random = new Random();//Rastgele kart numarası
        this.kartNumarasi = "5400" + (100000 + random.nextInt(900000));
        this.limit = limit;
        this.guncelBorc = guncelBorc;
        this.kullanilabilirLimit = limit - guncelBorc;
    }
    public String getKartNumarasi() {
        return kartNumarasi;
    }
    public void setKartNumarasi(String kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }
    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
        this.kullanilabilirLimit = limit - guncelBorc;
    }
    public double getGuncelBorc() {
        return guncelBorc;
    }
    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
        this.kullanilabilirLimit = this.limit - guncelBorc;
    }
    public double getKullanilabilirLimit() {
        return kullanilabilirLimit;
    }
    @Override
    public String toString() {
        return "Kart No: " + kartNumarasi + ", Limit: " + limit + ", Borç: " + guncelBorc + ", Kullanılabilir Limit: " + kullanilabilirLimit;
    }
}