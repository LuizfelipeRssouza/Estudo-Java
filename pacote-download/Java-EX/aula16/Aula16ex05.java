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
public class Aula16ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DISSECANDO MATRIZ 4x4");
        System.out.println("=====================");
        Scanner teclado = new Scanner(System.in);
        int n = 4;
        int m[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = teclado.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }

        // diagonais
        int diagPrincipal = 0;
        int diagSecundaria = 0;
        for (int i = 0; i < n; i++) {
            diagPrincipal += m[i][i];
            diagSecundaria += m[i][n - 1 - i];
        }

        System.out.println();
        System.out.println("Soma da diagonal principal: " + diagPrincipal);
        System.out.println("Soma da diagonal secundária: " + diagSecundaria);

        // linhas
        System.out.println();
        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += m[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        // colunas
        System.out.println();
        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += m[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }
    }

}
