

package com.bank.app.cards;

import java.util.Random;

public class KrediKarti {

	// sinif degiskenlerimizi olusturalim.
    private long kartNumarasi;
    private double limit;
    private double guncelBorc;

    // Constructor oluşturalım.
    public KrediKarti(double limit) {

        Random random = new Random();

        this.kartNumarasi =1000000000000000L + (long)(random.nextDouble() * 9000000000000000L);

        this.limit = limit;
        this.guncelBorc = 0;
    }

    
    // methodlarimizi oluşturalım.
    public long getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(long kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }

   
    public String toString() {
        return "Kart No: " + kartNumarasi + ", Limit: " + limit + ", Güncel Borç: " + guncelBorc;
    }
}