package aula12;

import java.util.Scanner;

public class Aula12ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("TABUADA INTELIGENTE");
        System.out.println("===================");
        int i = 1, n;
        System.out.print("Digite o Numro que deseja saber a tabuada: ");
        n = teclado.nextInt();
        do{
            System.out.printf("%d X %d = %d%n",i,n,i*n );
            i++;
        }while(i<=10);
    }
    
}
