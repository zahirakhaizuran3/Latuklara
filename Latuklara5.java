/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latuklara5;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Latuklara5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== HASIL REKAP NILAI PRODUKTIF RPL ===");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
