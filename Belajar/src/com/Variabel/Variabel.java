package com.Variabel;

    public class Variabel{
        public static void main(String[] args) {
            // Komentar : //  atau 
            /*
            Ini Komentar
            */
            // Variabel menyimpan tipe data string
            String namaDepan = "Juan Bastian";
            String namaBelakang = "Mambraku";

            String namaLengkap = namaDepan +" "+namaBelakang;

            System.out.println("Nama saya "+namaLengkap);

            // Variabel menyimpan data bilangan bulat atau integer
            int a, b, c;
            a = 2;
            b = 3;
            c = 5;
            int hasil = a + b + c;
            System.out.println("Hasil dari "+a+" + "+b+" + "+c+" = " +hasil);

            // Variabel menyimpan data bilangan desimal atau Double
            double x, y, z;
            x = 0.5;
            y = 0.5;
            z = 1.5;
            double jumlah = x + y + z;
            System.out.println("Hasil dari "+x+" + "+y+" + "+z+" = " +jumlah);
        }
    }