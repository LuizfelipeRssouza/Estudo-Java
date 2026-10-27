package Aula07;

import java.util.Scanner;

public class Aula07ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de segundos: ");
        int total = teclado.nextInt();

        int horas = total / 3600;
        int resto = total % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d segundos = %d h, %d min e %d s%n", total, horas, minutos, segundos);
    }
}