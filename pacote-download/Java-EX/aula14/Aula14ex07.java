package aula14;

import java.util.Scanner;

public class Aula14ex07 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("LUGARES DO CINEMA");
        System.out.println("=================");
        Scanner teclado = new Scanner(System.in);
        boolean ocupada[] = new boolean[10];   // todas começam livres (false)
        String resp;

        do {
            mostrar(ocupada);

            System.out.print("Qual cadeira deseja reservar (1 a 10)? ");
            int c = teclado.nextInt();

            if (c < 1 || c > 10) {
                System.out.println("ERRO: cadeira inexistente.");
            } else if (ocupada[c - 1]) {
                System.out.println("ERRO: a cadeira " + c + " já está ocupada.");
            } else {
                ocupada[c - 1] = true;
                System.out.println("Cadeira " + c + " reservada com sucesso!");
            }

            System.out.print("Quer reservar outro? [S/N] ");
            resp = teclado.next();
            System.out.println();
        } while (!resp.equalsIgnoreCase("N"));

        System.out.println("Situação final:");
        mostrar(ocupada);
    }

    public static void mostrar(boolean ocupada[]) {
        for (int i = 0; i < ocupada.length; i++) {
            if (ocupada[i]) {
                System.out.print("[X] ");
            } else {
                System.out.print("[" + (i + 1) + "] ");
            }
        }
        System.out.println();
    }

}
