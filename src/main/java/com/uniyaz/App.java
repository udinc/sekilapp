package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static List<Sekil> sekilLst = new ArrayList<>();

    private static Object List;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean donguDevamEdiyor = true;
        do {
            System.out.println("1.kare yarat");

            System.out.println("2. dikdortgen yarat");
            System.out.println("3. listele");
            System.out.println("4.Çıkış yapılacak");
            System.out.println("Seciminiz: ");

            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    Kare kare = new Kare(6);
                    kare.alanHesapla();
                    sekilLst.add(kare);
                    break;
                case 2:
                    Diktortgen dik = new Diktortgen(6, 4);
                    dik.alanHesapla();
                    sekilLst.add(dik);
                    break;

                case 3:
                    hesapla((ArrayList<Sekil>) sekilLst);
                    break;
                case 4:
                    donguDevamEdiyor = false;
                    break;


            }
            while (donguDevamEdiyor) ;


        }

        public static void hesapla (ArrayList<Sekil> skl1) {
            for (Sekil skl2 : skl1) {
                skl2.alanHesapla();
            }
        }

    }
}
