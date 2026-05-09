
// PACKAGE: com.bank.app.main


package com.bank.app.main;

import com.bank.app.people.Musteri;
import com.bank.app.people.BankaPersoneli;

import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.Yatırımhesabı;

import com.bank.app.cards.KrediKarti;

import com.bank.app.service.BankaService;

public class Main {

    public static void main(String[] args) {

        // Service nesnesi olusturalim.
        BankaService service = new BankaService();

        // Müşteri oluşturslim.
        Musteri musteri1 = new Musteri( "Ayşe","Yılmaz", "12345678910", "05468557462");

        System.out.println("Müşteri oluşturuldu.");

        // Personel oluşturma
        BankaPersoneli personel =
                new BankaPersoneli( "Fatma","Yıldırım", "98115476111", "05075440010");

        // Müşteriyi personele ekleme
        personel.musteriEkle(musteri1);

        // Hesap oluşturma
        musteri1.hesapEkle("vadesiz");
        musteri1.hesapEkle("yatirim");

        // Hesapları alma
        VadesizHesap vadesiz1 = (VadesizHesap)
                        musteri1.getHesaplar().get(0);

        Yatırımhesabı yatirim1 = (Yatırımhesabı)
                        musteri1.getHesaplar().get(1);

        // Para yatırma
        vadesiz1.paraEkle(5000);

        yatirim1.paraEkle(10000);

        // İkinci müşteri
        Musteri musteri2 = new Musteri("Ahmet","Demir","47699437856", "05452477544");

        // İkinci müşteriye hesap açma
        musteri2.hesapEkle("vadesiz");

        VadesizHesap vadesiz2 = (VadesizHesap)
                        musteri2.getHesaplar().get(0);

        // Para transferi
        vadesiz1.paraTransferi(vadesiz2, 1000);

        // Kredi kartı oluşturma
        musteri1.krediKartiEkle(20000);

        // Kartı alma
        KrediKarti kart =  musteri1.getKrediKartlari().get(0);

        // Kart borcu oluşturma
        kart.setGuncelBorc(3000);

        // Kart borcu ödeme
        vadesiz1.krediKartiBorcOdeme(kart, 1000);

        // Hesap silmeyi deneme
        musteri1.hesapSil(vadesiz1);

        // Bakiyeyi sıfırlama
        vadesiz1.paraCek(vadesiz1.getBakiye());

        // Tekrar silme
        musteri1.hesapSil(vadesiz1);

        // Borçlu kartı silmeye çalışma
        musteri1.krediKartiSil(kart);

        // Borcu sıfırlama
        kart.setGuncelBorc(0);

        // Kart silme
        musteri1.krediKartiSil(kart);

        // Bilgileri göster
        service.musteriBilgisiGoster(musteri1);
    }
}