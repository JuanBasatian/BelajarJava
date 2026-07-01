package com.LatihanHitungSegitiga;

public class LuasSegitiga {
    public static void main(String[] args){
        // Menghitung luas suatu segitiga siku siku
        double panjangAlas, tinggi;

        // Diketahui panjang alas adalah 12 cm dan tinggi 10cm
        panjangAlas = 12;
        tinggi = 10;

        double luas = 1.0/2.0 * panjangAlas * tinggi;

        System.out.println("Deketahui segitiga siku - siku memiliki panjang alas "+panjangAlas+" cm dan tinggi "+tinggi+" cm, "
        +"luas yang didapatkan adalah "+luas);
    }
}
