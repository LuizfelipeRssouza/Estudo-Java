package aula15;

import java.util.Scanner;

public class Aula15ex02 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SOMA RETORNO");
        System.out.println("==============");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = teclado.nextInt();

        int sm = somar(n1, n2);
        System.out.println("A soma entre " + n1 + " e " + n2 + " é: " + sm);
    }

    static int somar(int a, int b) {
        int s = a + b;
        return s;

    }
}
