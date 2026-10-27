package aula14;

import java.util.Arrays;
import java.util.Scanner;

public class Aula14ex04 {

    public static void main(String[] args) {
        System.out.println("ORDENAR VETOR");
        System.out.println("===============");
        Scanner teclado = new Scanner(System.in);
        int original[] = new int[5];
        for (int i = 0; i < original.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            original[i] = teclado.nextInt();
        }

        // duas cópias do vetor digitado
        int bolha[] = Arrays.copyOf(original, original.length);
        int pronto[] = Arrays.copyOf(original, original.length);

        // 1) bubble sort (seu algoritmo)
        for (int i = 0; i < bolha.length - 1; i++) {
            for (int j = 0; j < bolha.length - 1 - i; j++) {
                if (bolha[j] > bolha[j + 1]) {
                    int aux = bolha[j];
                    bolha[j] = bolha[j + 1];
                    bolha[j + 1] = aux;
                }
            }
        }

        // 2) Arrays.sort
        Arrays.sort(pronto);

        System.out.println();
        System.out.println("Original:    " + Arrays.toString(original));
        System.out.println("Bubble sort: " + Arrays.toString(bolha));
        System.out.println("Arrays.sort: " + Arrays.toString(pronto));

        if (Arrays.equals(bolha, pronto)) {
            System.out.println("Resultados IGUAIS");
        } else {
            System.out.println("Resultados DIFERENTES");
        }
    }
}
