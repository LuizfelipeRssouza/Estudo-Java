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
public class Aula16ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("VALORES DA MATRIZ 4x4");
        System.out.println("=====================");
        Scanner teclado = new Scanner(System.in);
        int m[][] = new int[4][4];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = teclado.nextInt();
            }
        }

        int soma = 0;
        int maior = m[0][0];
        int menor = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                }
            }
        }

        double media = (double) soma / 16;

        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.printf("Média: %.2f%n", media);
    }

}
