
// PACKAGE: com.bank.app.people

package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi {

    private int personelID;

    private ArrayList<Musteri> musteriler;

    // Constructor olusturma 
    public BankaPersoneli(String ad, String soyad, String tcKimlikNo,String telefonNo) {

    	
    // ust siniftan miras alma islemi icin 'super' kullaniriz.
    	
        super(ad, soyad, tcKimlikNo, telefonNo);

        Random random = new Random();

        this.personelID = 1000 + random.nextInt(9000);

        musteriler = new ArrayList<>();
    }

    public void musteriEkle(Musteri musteri) {

        musteriler.add(musteri);

        System.out.println("Müşteri personel listesine eklendi.");
    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }
}