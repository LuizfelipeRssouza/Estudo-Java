package aula14;

import java.util.Scanner;

public class Aula14ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int v[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        System.out.println("TOTAL DE PARES");
        System.out.println("===============");
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = teclado.nextInt();
            if (v[i] % 2 == 0) {
                total++;
            }
        }
        System.out.println("");
        for (int i : v) {
            if (i % 2 == 0) {
                System.out.println("O número " + i + " é PAR");
            }
        }
        System.out.println("E o total de par é " +total);
    }

}
