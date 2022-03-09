package com.mycompany.oopatm;

public class Test {

    public static void main(String[] args) {
        // Object Oriented(Nesne Yonelimli) ATM Programi
        //Login Class'i Kullanici Girisini Kontrol Edecek.
        //Hesap Class'i Hesap Islemlerini Yapacak.
        //ATM ise Atm mizi Calistiracak.

        Atm atm = new Atm();

        Hesap hesap = new Hesap("Furkan Ekiz", "12345", 2000);
        atm.calis(hesap);

    }
}
