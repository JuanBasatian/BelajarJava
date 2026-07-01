package com.LatihanHitungSegitiga;

public class TinggiSegitiga {
    public static void main(String [] args){
        /* 
        Contoh soal
        Sebuah segitiga siku siku memiliki luas 40 cm^2. Panjang alas segitiga ini adalah 8 cm.
        Berapakah panjang tinggi segitiga siku siku tersebut?
        
        */
    double panjangAlas, luas, tinggi;

    panjangAlas = 8.0;
    luas = 40.0;

    tinggi = 2.0 * luas / panjangAlas;
    
    System.out.println("Deketahui segitiga siku - siku memiliki Luas "+luas+" cm^2 dan panjang alas "+panjangAlas+" cm."
    +" Maka tinggi segitiga siku siku yang didapatkan adalah "+tinggi);
    }
    
}
