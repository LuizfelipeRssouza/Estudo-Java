package aula14;

import java.util.Scanner;

public class Aula14ex05 {

    public static void main(String[] args) {
        System.out.println("TORNEIO DE FUTEBOL");
        System.out.println("===================");
        Scanner teclado = new Scanner(System.in);
        String times[] = new String[4];
        int gols[] = new int[4];

        for (int i = 0; i < times.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º time: ");
            times[i] = teclado.nextLine();
            System.out.print("Digite os gols do " + times[i] + ": ");
            gols[i] = teclado.nextInt();
            teclado.nextLine(); // limpa o Enter que sobrou
        }
        System.out.println("");
        for (int i = 0; i < times.length; i += 2) {
            int j = i + 1;
            System.out.println("PARTIDA " + (i / 2 + 1));
            System.out.println(times[i] + " " + gols[i] + " x " + gols[j] + " " + times[j]);

            if (gols[i] > gols[j]) {
                System.out.println("Vencedor: " + times[i]);
            } else if (gols[j] > gols[i]) {
                System.out.println("Vencedor: " + times[j]);
            } else {
                System.out.println("EMPATE");
            }
            System.out.println();
        }
    }

}
