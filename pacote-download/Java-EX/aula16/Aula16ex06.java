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
public class Aula16ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        char t[][] = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = ' ';
            }
        }

        char jogador = 'X';
        int jogadas = 0;
        boolean fim = false;

        System.out.println("JOGO DA VELHA");
        System.out.println("=============");

        while (!fim) {
            mostrar(t);
            System.out.println("Vez do jogador " + jogador);
            System.out.print("Linha (1 a 3): ");
            int l = teclado.nextInt() - 1;
            System.out.print("Coluna (1 a 3): ");
            int c = teclado.nextInt() - 1;

            if (l < 0 || l > 2 || c < 0 || c > 2) {
                System.out.println("ERRO: posição inexistente. Jogue de novo.");
            } else if (t[l][c] != ' ') {
                System.out.println("ERRO: posição já ocupada. Jogue de novo.");
            } else {
                t[l][c] = jogador;
                jogadas++;

                if (venceu(t, jogador)) {
                    mostrar(t);
                    System.out.println("O jogador " + jogador + " VENCEU!");
                    fim = true;
                } else if (jogadas == 9) {
                    mostrar(t);
                    System.out.println("EMPATE! (deu velha)");
                    fim = true;
                } else {
                    jogador = (jogador == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    static void mostrar(char t[][]) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + t[i][0] + " | " + t[i][1] + " | " + t[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

    static boolean venceu(char t[][], char j) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == j && t[i][1] == j && t[i][2] == j) {
                return true;   // linha i completa
            }
            if (t[0][i] == j && t[1][i] == j && t[2][i] == j) {
                return true;   // coluna i completa
            }
        }
        if (t[0][0] == j && t[1][1] == j && t[2][2] == j) {
            return true;       // diagonal principal
        }
        if (t[0][2] == j && t[1][1] == j && t[2][0] == j) {
            return true;       // diagonal secundária
        }
        return false;
    }

}
