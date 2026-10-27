package aula10;

import java.util.Scanner;

public class Aula10ex02 {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MINE - CALCULADORA");
        System.out.println("====================");
        System.out.print("Digite o 1º número: ");
        double n1 = teclado.nextDouble();
        System.out.print("Digite o 2º número: ");
        double n2 = teclado.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char op = teclado.next().charAt(0);
        switch (op) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", n1, n2, n1 + n2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", n1, n2, n1 - n2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", n1, n2, n1 * n2);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("ERRO: não existe divisão por zero");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f%n", n1, n2, n1 / n2);
                }
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}
