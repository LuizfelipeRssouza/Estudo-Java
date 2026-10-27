package aula14;

import java.util.Scanner;

public class Aula14ex06 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CORRIGIR PROVAS");
        System.out.println("================");
        char  gab[] = {'A', 'B', 'C', 'A', 'C', 'D', 'A', 'E', 'B', 'A'};
         char resp[] = new char[gab.length];
        int acertos = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < gab.length; i++) {
            System.out.print("Digite a sua resposta (A/B/C/D/E) na questão " + (i + 1) + ": ");
            resp[i] = Character.toUpperCase(teclado.next().charAt(0));
        }
        for (int i = 0; i < gab.length; i++) {
            if (resp[i] == gab[i]) {
                acertos++;
            }
        }

        System.out.println();
        System.out.println("Você acertou " + acertos + " de " + gab.length + " questões.");
        System.out.println("Nota final: " + acertos + " ponto(s)");
    }

}
