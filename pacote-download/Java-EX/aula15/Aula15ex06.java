package aula15;

import java.util.Scanner;

public class Aula15ex06 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANALISADOR DE STRINGS");
        System.out.println("=====================");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        System.out.println();
        System.out.println("Tamanho: " + frase.length());
        System.out.println("Maiúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());

        int fim = Math.min(5, frase.length());
        System.out.println("5 primeiras letras: " + frase.substring(0, fim));

        System.out.print("\nDigite uma palavra para procurar: ");
        String procurada = teclado.nextLine();
        int pos = frase.indexOf(procurada);
        if (pos == -1) {
            System.out.println("A palavra \"" + procurada + "\" não foi encontrada.");
        } else {
            System.out.println("A palavra \"" + procurada + "\" começa na posição " + pos);
        }

        System.out.print("\nDigite a palavra que quer trocar: ");
        String antiga = teclado.nextLine();
        System.out.print("Digite a palavra nova: ");
        String nova = teclado.nextLine();
        System.out.println("Frase nova: " + frase.replace(antiga, nova));
    }
    
}
