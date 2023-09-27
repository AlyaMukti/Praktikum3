/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user;
        System.out.println("=== TOKO BUAH A ===");
        System.out.println("=====================");
        
        System.out.print("Jumlah Pembelian :");
        user = input.nextInt();
        int harga = 100000;
        int jumlahpembelian;
        
        System.out.print("Stok Tersisa");
        jumlahpembelian = input.nextInt();
        
        int total = jumlahpembelian*100000;
        if(total > 40);
        int diskon = total*10/100;
        int totalkeseluruhan = total - diskon;
        
        System.out.println("Jumlah Pembelian : " + jumlahpembelian);
        System.out.println("Stok Tersisa : " + jumlahpembelian);
        System.out.println("Hasil pembelian : " + diskon);
    }
}
