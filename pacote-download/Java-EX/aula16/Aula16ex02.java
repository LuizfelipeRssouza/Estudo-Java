/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16;

import java.util.Scanner;

/**
 *
 * @author luizf
 */
public class Aula16ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MATRIZ[3] [3] ");
        System.out.println("============");
        Scanner teclado = new Scanner(System.in);
        int m[][] = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = teclado.nextInt();
            }
        }
        System.out.println();
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0) {
                    System.out.println("O valor " + m[i][j] + " é PAR e está na linha " + i + ", coluna " + j);
                    total++;
                }
            }
        }

        if (total == 0) {
            System.out.println("Nenhum valor par foi encontrado.");
        } else {
            System.out.println("Total de pares: " + total);
        }
    }

}
