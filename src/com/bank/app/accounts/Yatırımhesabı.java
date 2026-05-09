
// PACKAGE: com.bank.app.accounts


package com.bank.app.accounts;

public class Yatırımhesabı extends Hesap {
	
    // Constructor oluşturalım.
	
    public Yatırımhesabı() {
        super();
    }

   // paraEkle methodunu kullanalım
    public void paraEkle(double miktar) {

        if (miktar > 0) {

            bakiye += miktar;

            System.out.println("Yatırım hesabına " +
                    miktar + " TL yatırıldı.");
        }
    }

    // paraCek methodunu olusturalim.
    public void paraCek(double miktar) {

        if (miktar <= bakiye) {

            bakiye -= miktar;

            System.out.println("Yatırım hesabından " + miktar + " TL çekildi.");
            
            
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }
}