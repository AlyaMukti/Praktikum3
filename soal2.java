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
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int BanyakBarang;
        System.out.println("Bawaan tas Aku >.<");
        System.out.println("=====================");
        
        System.out.print("Jumlah Laptop : ");
        BanyakBarang = input.nextInt();
        
        System.out.print("Banyak Buku Tulis : ");
        BanyakBarang = input.nextInt();
        
        System.out.print("Banyak Kotak Pensil : ");
        BanyakBarang = input.nextInt();
        
        System.out.print("Banyak HP : ");
        BanyakBarang = input.nextInt();
       
        if(BanyakBarang > 5){        
        System.out.println("Barang Kamu Melebihi Ketentuan T_T");
        }    
        else if(BanyakBarang < 5){
        System.out.println("Barang kamu Aman >.<");
        }
    }
}