package aula08;

import java.util.Scanner;

public class Aula08ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ANO BISSEXTO");
        System.out.println("=============");
        System.out.print("Digite um ano: ");
        int ano = teclado.nextInt();
        String bi = (ano % 4 == 0) ? "BISSEXTO" : "NÃO BISSEXTO";
        System.out.printf("O ano %d e %s %n",ano, bi);
    }
    
}
