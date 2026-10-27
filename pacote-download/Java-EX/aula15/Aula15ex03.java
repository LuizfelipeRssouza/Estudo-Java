
package aula15;

import java.util.Scanner;

public class Aula15ex03 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("EH PAR");
        System.out.println("=======");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = teclado.nextInt();
        if (ehPar(n1)) {
            System.out.println("O número " + n1 + " é PAR");
        } else {
            System.out.println("O número " + n1 + " é ÍMPAR");
        }
    }

    static boolean ehPar(int n) {
        return n % 2 == 0;
    }
}
