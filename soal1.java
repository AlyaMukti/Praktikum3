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
public class soal1 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int nilai;
        
        System.out.println("Apakah angka berikut merupakan kelipatan 5?");
        System.out.println("====================");
        System.out.print("Masukkan angka : ");
        nilai = masukkan.nextInt();
        
        if(nilai % 5 == 0) {
        System.out.println("Program Started");
        } else {
        System.out.println("Program Halted");
        }
    }
}