
// PACKAGE: com.bank.app.people

package com.bank.app.people;

// kullanacagimiz siniflari import edelim.

import java.util.ArrayList;
import java.util.Random;

import com.bank.app.accounts.Hesap;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.Yatırımhesabı;
import com.bank.app.cards.KrediKarti;

public class Musteri extends Kisi {

    private int musteriNumarasi;

    private ArrayList<Hesap> hesaplar;

    private ArrayList<KrediKarti> krediKartlari;

    // Constructor oluşturalım.
    public Musteri(String ad,String soyad, String tcKimlikNo, String telefonNo) {

        super(ad, soyad, tcKimlikNo, telefonNo);

        Random random = new Random();

        this.musteriNumarasi =
                10000 + random.nextInt(90000);

        hesaplar = new ArrayList<>();
        krediKartlari = new ArrayList<>();
    }

    // Hesap ekleme işlemi
    public void hesapEkle(String hesapTuru) {

        if (hesapTuru.equalsIgnoreCase("vadesiz")) {

            VadesizHesap hesap =
                    new VadesizHesap();

            hesaplar.add(hesap);

            System.out.println("Vadesiz hesap oluşturuldu.");
        }

        else if (hesapTuru.equalsIgnoreCase("yatirim")) {

            Yatırımhesabı hesap = new Yatırımhesabı();

            hesaplar.add(hesap);

            System.out.println("Yatırım hesabı oluşturuldu.");
        }

        else {
            System.out.println("Geçersiz hesap türü.");
        }
    }

    // Hesap silme işlemi
    public void hesapSil(Hesap hesap) {

        if (hesap.getBakiye() > 0) {

            System.out.println( "Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        }

        else {

            hesaplar.remove(hesap);

            System.out.println("Hesap silindi.");
        }
    }

    // Kredi kartı ekleme
    public void krediKartiEkle(double limit) {

        KrediKarti kart =
                new KrediKarti(limit);

        krediKartlari.add(kart);

        System.out.println("Kredi kartı oluşturuldu.");
    }

    // Kredi kartı silme
    public void krediKartiSil(KrediKarti kart) {

        if (kart.getGuncelBorc() == 0) {

            krediKartlari.remove(kart);

            System.out.println("Kredi kartı silindi.");
        }

        else {

            System.out.println( "Lütfen öncelikle borç ödemesi yapınız.");
        }
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public ArrayList<Hesap> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<Hesap> hesaplar) {
        this.hesaplar = hesaplar;
    }

    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    public void setKrediKartlari(
            ArrayList<KrediKarti> krediKartlari) {

        this.krediKartlari = krediKartlari;
    }

  
    public String toString() {

        return super.toString() + ", Müşteri No: " + musteriNumarasi;
    }
}