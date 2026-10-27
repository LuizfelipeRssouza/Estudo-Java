package aula10;

import java.util.Scanner;

public class Aula10ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIA DA SEMANA");
        System.out.println("==============");
        System.out.print("Digite um numero de 1 ao 7: ");
        int d = teclado.nextInt();
        String dia;
        System.out.print("E um(a) ");
        switch(d){
            case 1:
                dia = "DOMINGO";
                break;
            case 2:
                dia = "SEGUNDA - FEIRA";
                break;
            case 3:
                dia = "TERÇA - FEIRA";
                break;
            case 4:
                dia = "QUARTA - FEIRA";
                break;
            case 5:
                dia = "QUINTA - FEIRA";
                break;
            case 6:
                dia = "SEXTA - FEIRA";
                break;
            default:
                dia = "SABADO";
        }
        System.out.println(dia);
    }
    
}
