package aula13;

import java.util.Scanner;

public class Aula13ex02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("ANALISADOR");
        System.out.println("===========");
        int n, s = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, totalp = 0, total = 0;
        float media;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            n = teclado.nextInt();
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
            if (n % 2 == 0) {
                totalp++;
            }
            s += n;
            total++;
        }
        media = (float) s / total;
        System.out.printf("A SOMA = %d | A MÉDIA = %.2f | O MAIOR = %d | O MENOR = %d | TOTAL PAR = %d%n", s, media, maior, menor, totalp);
    }

}
