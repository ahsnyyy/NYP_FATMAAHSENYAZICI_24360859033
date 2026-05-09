
// PACKAGE: com.bank.app.accounts


package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends Hesap {

    public VadesizHesap() {
        super();
    }

    // Hesaplar arası para transferi
    public void paraTransferi(VadesizHesap aliciHesap, double miktar) {

        if (miktar <= this.bakiye) {

            this.bakiye -= miktar;
            aliciHesap.bakiye += miktar;

            System.out.println(miktar + " TL transfer edildi.");
            
            
        } else {
            System.out.println("Transfer için bakiye yetersiz.");
        }
    }

    // Kredi kartı borcu ödeme
    public void krediKartiBorcOdeme(KrediKarti kart, double miktar) {

        if (miktar <= this.bakiye && miktar <= kart.getGuncelBorc()) {

            this.bakiye -= miktar;
            kart.setGuncelBorc(kart.getGuncelBorc() - miktar);

            System.out.println("Kredi kartı borcu ödendi.");
        } else {
            System.out.println("Ödeme işlemi başarısız.");
        }
    }
}