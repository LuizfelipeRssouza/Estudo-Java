/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

import java.util.Scanner;

/**
 *
 * @author luizf
 */
public class Aula15ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("DETECTOR PESADO");
        System.out.println("=================");
        double pes[] = new double[5];
        for (int i = 0; i < pes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º peso: ");
            pes[i] = teclado.nextDouble();
        }
        int pos = posicaoMaisPesada(pes);

        System.out.println();
        System.out.printf("A pessoa mais pesada é a %dª, com %.1f kg (posição %d no vetor).%n",
                pos + 1, pes[pos], pos);

    }

    static int posicaoMaisPesada(double v[]) {
        int posicaoMaior = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i] > v[posicaoMaior]) {
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }
}
