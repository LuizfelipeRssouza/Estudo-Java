package aula08;

import java.util.Scanner;

public class Aula08ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ENTRE 10 E 20");
        System.out.println("==============");
        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();
        boolean r = num >= 10 && num <= 20;
        System.out.printf("Esta entre 10 e 20: %b%n",r);
    }
    
}
