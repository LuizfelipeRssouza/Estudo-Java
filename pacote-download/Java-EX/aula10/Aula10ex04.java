package aula10;

import java.util.Scanner;

public class Aula10ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("LANCHE");
        System.out.println("=======");
        System.out.println("[1] Cachorro Quente R$ 4,00");
        System.out.println("[2] X - Salada R$ 4,50");
        System.out.println("[3] X - Becon R$ 5,00");
        System.out.println("[4] Torrada Simples R$ 2,00");
        System.out.println("[5] Refrigerante R$ 1,50");
        System.out.print("Escolha uma opção: ");
        int op = teclado.nextInt();
        System.out.print("Digite a porção que deseja: ");
        int pc = teclado.nextInt();
        switch(op){
            case 1:
                System.out.printf("Total: R$%.2f%n",pc *4.00);
                break;
            case 2:
                System.out.printf("Total: R$%.2f%n",pc *4.50);
                break;
            case 3:
                System.out.printf("Total: R$%.2f%n",pc *5.00);
                break;
            case 4:
                System.out.printf("Total: R$%.2f%n",pc *2.00);
                break;
            case 5:
                System.out.printf("Total: R$%.2f%n",pc *1.50);
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}
