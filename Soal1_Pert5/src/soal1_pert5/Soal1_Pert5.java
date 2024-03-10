/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1_pert5;

/* Oktavina Zahra R - 2207287 */

import java.util.Scanner;

public class Soal1_Pert5 {

    static int hitungPenjumlahanDeret(int N) {
        int hasil = 0;

        for (int i = 1; i <= N; i++) {
            hasil += i;
            
            System.out.print(i);
            if (i < N) {
                System.out.print(" + ");
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner deret = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = deret.nextInt();

        int hasil = hitungPenjumlahanDeret(N);
        System.out.println(" = " + hasil);
    }
    
}
