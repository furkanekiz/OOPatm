package com.mycompany.oopatm;

import java.util.Scanner;

public class Atm {

    public void calis(Hesap hesap) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hosgeldiniz...");
        System.out.println("*****************************");
        System.out.println("Kullanici Girisi");
        System.out.println("*****************************");
        int girisHakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giris Basarili...");
                break;
            } else {
                System.out.println("Giris Basarisiz...");
                girisHakki--;
                System.out.println("Kalan Giris Hakki: " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris Hakkiniz Bitti...");
                return;
            }
        }
        System.out.println("*****************************");
        String islemler = "1.Bakiye Goruntule\n"
                + "2.Para Yatirma\n"
                + "3.Para Cekme\n"
                + "Cikis icin q'ya Basin";
        System.out.println(islemler);
        System.out.println("*****************************");

        while (true) {
            System.out.println("Islemi Seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor..");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatirmak istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Cekmek istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Gecersiz Islem....");
            }
        }
    }
}
