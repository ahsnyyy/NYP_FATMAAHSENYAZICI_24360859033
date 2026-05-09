package com.bank.app.people;

//PACKAGE: com.bank.app.people



public class Kisi {
	
	
// Sınıf içindeki Degiskenlerimizi tanimlayalim.

 private String ad;
 private String soyad;
 private String tcKimlikNo;
 private String telefonNo;

 // Constructor oluşturalım.
 public Kisi(String ad, String soyad, String tcKimlikNo, String telefonNo) {
     this.ad = ad;
     this.soyad = soyad;
     this.tcKimlikNo = tcKimlikNo;
     this.telefonNo = telefonNo;
 }

 // Getter ve Setter Metotlarını Kullanalım.

 public String getAd() {
     return ad;
 }

 public void setAd(String ad) {
     this.ad = ad;
 }

 public String getSoyad() {
     return soyad;
 }

 public void setSoyad(String soyad) {
     this.soyad = soyad;
 }

 public String getTcKimlikNo() {
     return tcKimlikNo;
 }

 public void setTcKimlikNo(String tcKimlikNo) {
     this.tcKimlikNo = tcKimlikNo;
 }

 public String getTelefonNo() {
     return telefonNo;
 }

 public void setTelefonNo(String telefonNo) {
     this.telefonNo = telefonNo;
 }


 public String toString() {
     return "Ad: " + ad + ", Soyad: " + soyad + ", TC: " + tcKimlikNo +", Telefon: " + telefonNo;
 }
}