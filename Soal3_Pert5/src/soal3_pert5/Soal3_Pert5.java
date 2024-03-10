/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_pert5;

/* Oktavina Zahra R - 2207287 */

import java.util.Scanner;

public class Soal3_Pert5 {

    static int hitungFaktorial(int n) {
        int hasilFaktorial = 1;

        for (int i = 1; i <= n; i++) {
            hasilFaktorial *= i;
        }

        return hasilFaktorial;
    }
    
    static void tampilkanFaktorial(int n) {
        System.out.print(n + "! = ");

        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        Scanner faktorial = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = faktorial.nextInt();
        
        tampilkanFaktorial(n);
        
        int hasilFaktorial = hitungFaktorial(n);
        System.out.println(" = " + hasilFaktorial);
    }
    
}
