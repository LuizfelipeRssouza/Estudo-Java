/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

import java.util.Scanner;

/**
 *
 * @author luizf
 */
public class Aula15ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULADORA FUNCAO");
        System.out.println("====================");
        System.out.print("Digite um Numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite outro Numero: ");
        int n2 = teclado.nextInt();
        System.out.println();
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.print("Escolha uma opção: ");
        int op = teclado.nextInt();

        switch (op) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + somar(n1, n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + subtrair(n1, n2));
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " + multiplicar(n1, n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("ERRO: não existe divisão por zero");
                } else {
                    System.out.printf("%d / %d = %.2f%n", n1, n2, dividir(n1, n2));
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static int subtrair(int a, int b) {
        return a - b;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

    static double dividir(int a, int b) {
        return (double) a / b;
    }
}
