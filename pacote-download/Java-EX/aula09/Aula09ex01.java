package aula09;

import java.util.Scanner;

public class Aula09ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INDICE DE MASSA CORPORAL(IMC)");
        System.out.println("==============================");
        System.out.print("Digite seu peso (kg): ");
        float peso = teclado.nextFloat();
        System.out.print("Digite sua altura (m): ");
        float alt = teclado.nextFloat();
        float imc = peso / (alt * alt);
        System.out.printf("Seu IMC é %.1f%n", imc);
        if (imc < 18.5) {
            System.out.println("ABAIXO DO PESO");
        } else if (imc < 25) {
            System.out.println("PESO NORMAL");
        } else if (imc < 30) {
            System.out.println("SOBREPESO");
        } else if (imc < 35) {
            System.out.println("OBESIDADE GRAU I");
        } else if (imc < 40) {
            System.out.println("OBESIDADE GRAU II");
        } else {
            System.out.println("OBESIDADE GRAU III");
        }
  }
}
