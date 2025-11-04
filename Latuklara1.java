 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latuklara1;
/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Latuklara1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaUtama = berat * biayaPerKg;

        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        double totalBiaya = biayaUtama + biayaVolume;

        System.out.println("\n=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Jarak pengiriman: " + jarak + " km");
        System.out.println("Volume paket: " + volume + " cm³");
        System.out.println("Biaya utama: Rp " + biayaUtama);
        System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
    }
}

        

