package com.bank.app.service;

/* İş mantığını ve sistem mesajlarını yöneten servis sınıfı */
public class BankaService {
    
    // Banka sisteminden kullanıcıya bilgi mesajı gönderen metot
    public void bilgiMesaji(String mesaj) {
        // Konsol ekranına banka servisi başlığıyla mesajı yazdırır
        System.out.println("Banka Servisi Bilgilendirmesi: " + mesaj);
    }
}