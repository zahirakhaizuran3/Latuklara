/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latuklara6;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Latuklara6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Penjumlahan matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Tampilkan hasil
        System.out.println("\n=== HASIL PENJUMLAHAN MATRIKS ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
