package aula07;

import java.util.Scanner;

public class Aula07ex02 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("CONVERSOR DE REAL PARA DOLAR");
        System.out.println("==============================");
        System.out.print("Quantos reais quer converter: ");
        double r = teclado.nextDouble();
        double con =  r/4.99;
        System.out.printf("Você tera %.2f DOLAR%n",con);
    }
}
