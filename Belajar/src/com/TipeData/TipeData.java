package com.TipeData;

public class TipeData {
    public static void main(String[] args){
        
        // Tipe data unutk menentukan nilai kebenaran (true or false) gunakan boolean
        boolean keteranganLulus = true;
        // Tipe data yang hanya bisa menampilkan 1 huruf, gunakan char
        char nilaiAkhir = 'A';
        // Menyimpan tulisan lebih dari 1 huruf, gunakan String
        String namaLengkap = "Juan Bastian Mambbraku";
        // Bilangan bulat unutk  8 bit bisa menggunakan byte
        byte bilanganBulatKecil = 100;
        // Bilangan bulat untuk 32 bit bisa menggunakan int
        int bilBulatMenengah = 1000000;
        // Bilangan bulat untuk 64 bit bisa menggunakan long
        long bilBulatBesar = 1000000000;
        /*  
            Bilangan yang dapat menyimpan nilai desimal, gunakan float untuk data berukuran 32 bit
            Sedangkan double dapat digunakan unutk data yang berukuran 64 bit
        */
       double desimalBesar = 2.099888987;
       float desimalKecil = (float) 0.2;
       
       System.out.println("Hasil dari tipe data boolean : "+keteranganLulus);
       System.out.println("Hasil dari tipe data char    : "+nilaiAkhir);
       System.out.println("Hasil dari tipe data String  : "+namaLengkap);
       System.out.println("Hasil dari tipe data byte    : "+bilanganBulatKecil);
       System.out.println("Hasil dari tipe data iny     : "+bilBulatMenengah);
       System.out.println("Hasil dari tipe data long    : "+bilBulatBesar);
       System.out.println("Hasil dari tipe data double  : "+desimalBesar);
       System.out.println("Hasil dari tipe data float   : "+desimalKecil);
    }
}
