package aula07;

import java.util.Scanner;

public class Aula07ex03 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("==========");
        System.out.println("HIOTENUSA");
        System.out.println("==========");
        System.out.print("Digite o 1º cateto: ");
        int cat1 = teclado.nextInt();
        System.out.print("Digite o 2º cateto: ");
        int cat2 = teclado.nextInt();
        int h = (int) Math.sqrt((Math.pow(cat1, 2) + Math.pow(cat2, 2)));
        System.out.printf("A HIPOTENUSA dos catetos %d e %d e: %d %n",cat1,cat2,h);
    }
}
