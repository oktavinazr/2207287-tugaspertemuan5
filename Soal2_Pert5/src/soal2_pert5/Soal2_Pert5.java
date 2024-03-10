/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_pert5;

/* Oktavina Zahra R - 2207287 */

import java.util.Scanner;

public class Soal2_Pert5 {

    static int banyakBilanganGanjil(int batasAwal, int batasAkhir) {
        int banyakGanjil = 0;

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                banyakGanjil++;
            }
        }
        
        return banyakGanjil;
    }

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = bilangan.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = bilangan.nextInt();

        int banyakGanjil = banyakBilanganGanjil(batasAwal, batasAkhir);
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " - " + batasAkhir + " adalah: " + banyakGanjil);
    }
    
}

