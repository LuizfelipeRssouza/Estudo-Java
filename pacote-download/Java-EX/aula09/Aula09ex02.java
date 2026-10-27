package aula09;

import java.util.Scanner;

public class Aula09ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("APROVEITAMENTO DO ALUNO");
        System.out.println("========================");
        System.out.print("Digite a sua N1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua N2: ");
        float n2 = teclado.nextFloat();
        System.out.print("Digite quantos dias frequentou a Escola: ");
        int d = teclado.nextInt();
        float m = (n1 + n2)/2;
        float f = d * 100f / 200;
        boolean notaOk = m >= 6;
        boolean freqOk = f >= 75;
         System.out.printf("Média: %.2f | Frequência: %.1f%%%n", m, f);
        if (notaOk && freqOk) {
            System.out.println("ALUNO APROVADO");
        } else if (!notaOk && !freqOk) {
            System.out.println("REPROVADO por nota e por frequência");
        } else if (!notaOk) {
            System.out.println("REPROVADO por nota");
        } else {
            System.out.println("REPROVADO por frequência");
        }
    }
}
