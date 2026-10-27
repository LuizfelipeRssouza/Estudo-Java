package aula15;

import java.util.Scanner;

public class Aula15ex01 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SOMADOR PROCEDIMENTO");
        System.out.println("=======================");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro Número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo Número: ");
        int n2 = teclado.nextInt();
        somar(n1, n2);
    }
    
    static void somar(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
    
}
