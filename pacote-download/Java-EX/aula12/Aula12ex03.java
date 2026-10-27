package aula12;

import java.util.Scanner;

public class Aula12ex03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("FATORIAL");
        System.out.println("=========");
        System.out.print("Digite um numero: ");
        int n = teclado.nextInt();
        if (n < 0) {
        System.out.println("Não existe fatorial de número negativo.");
        return;
    }
         long fat = 1;
         int i = 1;
        do{
           fat *= i;
           i++;
        }while(i <= n);
        System.out.printf("%d! = %d%n", n, fat);
    }
}
