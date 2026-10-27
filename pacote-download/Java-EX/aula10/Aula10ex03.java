package aula10;

import java.util.Scanner;

public class Aula10ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("TIME DE FUTEBOL");
        System.out.println("================");
        System.out.print("Digite o total de gols do 1º time: ");
        int time1 = teclado.nextInt();
        System.out.print("Digite o total de gols do 2º time: ");
        int time2 = teclado.nextInt();
        int dif = Math.abs(time1 - time2);
        System.out.println("Diferença de gols: " + dif);
        switch(dif){
            case 0:
                System.out.println("EMPATE");
                break;
            case 1, 2 , 3:
                System.out.println("PARTIDA NORMAL");
                break;
            case 4, 5, 6, 7:
                System.out.println("GOLEADA!");
                break;
            default:
                System.out.println("ALGO INCOMUM. Os dados foram digitados corretamente?");
        }
    }
}
