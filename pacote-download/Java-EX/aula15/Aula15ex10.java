/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

/**
 *
 * @author luizf
 */
public class Aula15ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PRIMOS DE 1 A 100");
        System.out.println("=================");

        int total = 0;
        for (int n = 1; n <= 100; n++) {
            if (ehPrimo(n)) {
                System.out.print(n + " ");
                total++;
            }
        }
        System.out.println();
        System.out.println("Total de primos: " + total);
    }

    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
