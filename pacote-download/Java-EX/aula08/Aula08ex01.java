package aula08;

import java.util.Scanner;

public class Aula08ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MEDIA ESCOLAR");
        System.out.println("==============");
        System.out.print("Digite a N1 do aluno: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a N2 do anuno: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2)/2;
        String situacao = (media >= 6) ? "aprovado" : "reprovado";
        System.out.printf("Média: %.1f - Aluno %s%n", media, situacao);
    }
    
}
