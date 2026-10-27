package aula6;

import java.util.Scanner;

public class Aula602 {
    public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
        System.out.println("Troca de valores");
        System.out.print("Digite o 1º valor: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o 2º valor: ");
        int n2 = teclado.nextInt();
        int aux = n2;
        n2 = n1;
        n1 = aux;
        System.out.printf("Valores trocados: %d  %d%n", n1, n2);
    }
}
