package aula11;

import java.util.Scanner;

public class Aula11ex01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("CONTADOR PERSONALIZADO");
        System.out.println("========================");
        System.out.print("Digite um Numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o Segundo Numero: ");
        int n2 = teclado.nextInt();
        System.out.print("Digite o quanto de passo: ");
        int pas = teclado.nextInt();
        if (pas == 0) {
            System.out.println("O passo não pode ser zero.");
            return;
        }
        pas = Math.abs(pas);
        int i = n1;
        if (n1 <= n2) {
            while (i <= n2) {
                System.out.print(i + " ");
                i += pas;
            }
        } else {
            while (i >= n2) {
                System.out.print(i + " ");
                i -= pas;
            }
        }
        System.out.println();
    }
}
