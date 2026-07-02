package com.InputOutputSederhana;
import java.util.Scanner;
public class InputOutputSederhana {
    public static void main(String []args){
        Scanner inputBaku = new Scanner(System.in);

        System.out.println("---Perbedaan menggunakan println dengan print saja---");
        System.out.println("Menggunakan println :");
        System.out.println("Masukkan jumlah mahasiswa baru : ");
        int jumlah = inputBaku.nextInt();

        System.out.println("Menggunakan print :");
        System.out.print("Masukkan jumlah mahasiswa baru : ");
        jumlah = inputBaku.nextInt();

        System.out.println("Jumlah mahasiswa baru adalah "+jumlah);
    }
}
