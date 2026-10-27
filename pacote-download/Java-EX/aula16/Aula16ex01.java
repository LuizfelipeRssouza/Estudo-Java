/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author luizf
 */
public class Aula16ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MATRIZ[3][2]");
        System.out.println("===========");
        Scanner teclado = new Scanner(System.in);
        int m[][] = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = teclado.nextInt();
            }
        }
        System.out.println();
        System.out.println("MATRIZ DIGITADA");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }

}
