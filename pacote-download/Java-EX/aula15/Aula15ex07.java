/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

import java.util.Arrays;

/**
 *
 * @author luizf
 */
public class Aula15ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("VALOR OU REFERÊNCIA?");
        System.out.println("====================");

        // 1) int
        int numero = 5;
        System.out.println("Antes (int): " + numero);
        somar10(numero);
        System.out.println("Depois (int): " + numero);

        System.out.println();

        // 2) vetor
        int v[] = {1, 2, 3};
        System.out.println("Antes (vetor): " + Arrays.toString(v));
        somar10(v);
        System.out.println("Depois (vetor): " + Arrays.toString(v));
    }

    static void somar10(int n) {
        n += 10;
        System.out.println("  Dentro do método (int): " + n);
    }

    static void somar10(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] += 10;
        }
        System.out.println("  Dentro do método (vetor): " + Arrays.toString(v));
    }
    }
