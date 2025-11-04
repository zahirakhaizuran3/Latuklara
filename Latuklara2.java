/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latuklara2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Latuklara2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }
    }
}
