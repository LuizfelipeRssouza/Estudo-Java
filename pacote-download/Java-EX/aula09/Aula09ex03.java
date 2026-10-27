package aula09;

import java.util.Scanner;

public class Aula09ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("EQUILÁTERO || ISÓSCELES || ESCALENO");
        System.out.println("====================================");
        System.out.print("Digite o 1º lado: ");
        int lad1 = teclado.nextInt();
        System.out.print("Digite o 2º lado: ");
        int lad2 = teclado.nextInt();
        System.out.print("Digite o 3º lado: ");
        int lad3 = teclado.nextInt();
        if (lad1 >= lad2 + lad3 || lad2 >= lad1 + lad3 || lad3 >= lad1 + lad2) {
            System.out.println("NÃO FORMA UM TRIÂNGULO");
        } else if (lad1 == lad2 && lad2 == lad3) {
            System.out.println("EQUILÁTERO");
        } else if (lad1 == lad2 || lad1 == lad3 || lad2 == lad3) {
            System.out.println("ISÓSCELES");
        } else {
            System.out.println("ESCALENO");
        }
    }
}
