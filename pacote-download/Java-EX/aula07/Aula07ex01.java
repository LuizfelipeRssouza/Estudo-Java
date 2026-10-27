package aula07;

import java.util.Scanner;

public class Aula07ex01 {

    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("MEDIA DE NOTAS");
        System.out.println("================");
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a nota da N1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a nota da N2: ");
        float n2 = teclado.nextFloat();
        System.out.print("Digite a nota da N3: ");
        float n3 = teclado.nextFloat();
        float media = (float)(n1+n2+n3)/3;
        System.out.printf("A media das notas N1:%.2f, N2:%.2f, N3:%.2f é: %.2f\n",n1,n2,n3,media);
    }
    
}
