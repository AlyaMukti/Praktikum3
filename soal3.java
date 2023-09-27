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
public class soal3 {
    public static void main(String[] args) {
        int barang, jumlahItem, gratis;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("BELI 3 GRATIS 1 NICHH");
        System.out.println("===SELAMAT DATANG DI TOKO ALYOUNG====");
        System.out.println("Masukan jumlah barang agar anda mendapatkan bonus");
        System.out.println("=====================");
        System.out.print("Jumlah Barang : ");
        barang = input.nextInt();
        
        if(barang %7 == 0 && barang % 3 == 0){
        gratis = 5500* (barang/7);
        jumlahItem = barang + (barang/3);
        
        }else{
        gratis =5500* (int)(barang/7);
        jumlahItem = barang + (barang/3);
        
        System.out.println("Banyak pembelian anda : " + barang );
        System.out.println("Cashback : "+(jumlahItem-barang));
        System.out.println("Item dan mendapat cashback sebesar :" + gratis);
        System.out.println("Total belanjaan Anda sebanyak : " + jumlahItem + " Item ");
    }
  }
}

