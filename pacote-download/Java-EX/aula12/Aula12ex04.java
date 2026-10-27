package aula12;

import java.util.Scanner;

public class Aula12ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("NÚMERO PRIMO");
        System.out.println("============");

        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        int i = 1;
        int divisores = 0;
        do {
            if (n % i == 0) {
                divisores++;
            }
            i++;
        } while (i <= n);

        System.out.println("O número " + n + " tem " + divisores + " divisor(es).");

        if (divisores == 2) {
            System.out.println(n + " é PRIMO");
        } else {
            System.out.println(n + " NÃO é primo");
        }
    }
    
}
