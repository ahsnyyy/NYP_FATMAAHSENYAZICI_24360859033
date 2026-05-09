
// PACKAGE: com.bank.app.accounts

package com.bank.app.accounts;

// Random sinifini import edelim.

import java.util.Random;

public abstract class Hesap {
// sinif degiskenlerimizi olusturalim.
	
    public String iban;
    public double bakiye;

    // Constructor oluşturalım.
    public Hesap() {

        Random random = new Random();

        this.iban = "TR" + (100000 + random.nextInt(900000));
        this.bakiye = 0;
    }

    // Hesaba para yatırma
    public void paraEkle(double miktar) {

        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL hesaba yatırıldı.");
        }
    }

    // Hesaptan para çekme
    public void paraCek(double miktar) {

        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL hesaptan çekildi.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

   
    public String toString() {
        return "IBAN: " + iban + ", Bakiye: " + bakiye;
    }
}
