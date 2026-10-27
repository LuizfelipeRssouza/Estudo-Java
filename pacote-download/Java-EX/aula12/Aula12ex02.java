package aula12;

import java.util.Scanner;

public class Aula12ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("SELETOR DE PESSOAS");
        System.out.println("===================");
        int total = 0;
        int mulheres = 0;
        int somaIdades = 0;
        int castanhos = 0;
        String resp;
        do {
            System.out.print("Sexo [M/F]: ");
            String sexo = teclado.next();
            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            System.out.print("Cor do cabelo: ");
            String cabelo = teclado.next();
            total++;
            somaIdades += idade;
            if (sexo.equalsIgnoreCase("F")) {
                mulheres++;
            }
            if (cabelo.equalsIgnoreCase("castanho")) {
                castanhos++;
            }
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equalsIgnoreCase("S"));
        double media = (double) somaIdades / total;
        System.out.println();
        System.out.println("Pessoas cadastradas: " + total);
        System.out.println("Mulheres: " + mulheres);
        System.out.printf("Média das idades: %.1f%n", media);
        System.out.println("Com cabelo castanho: " + castanhos);
    }
    
}
