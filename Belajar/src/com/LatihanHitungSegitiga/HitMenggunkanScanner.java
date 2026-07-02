package com.LatihanHitungSegitiga;

import java.util.Scanner;

public class HitMenggunkanScanner {
    public static void main(String[] args) {
        Scanner dataSegitiga = new Scanner(System.in);
        // Deklarasi variabel
        int alas, tinggi;
        double luas;

        System.out.print("Masukkan alas segitiga : ");
        alas = dataSegitiga.nextInt();

        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = dataSegitiga.nextInt();
        // Menghitung luas segitiga
        luas = 0.5 * alas * tinggi;

        System.out.println("Segitiga dengan alas : "+alas);
        System.out.println("dan tingginya : "+tinggi);
        System.out.println("mempunyai luas = "+luas);
    }
}
