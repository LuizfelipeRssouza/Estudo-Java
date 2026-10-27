package aula14;

import java.util.Scanner;

public class aula14ex03 {

    public static void main(String[] args) {
        System.out.println("LISTAGEM DE ALUNOS");
        System.out.println("===================");
        Scanner teclado = new Scanner(System.in);
        String alunos[] = new String[5];
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            alunos[i] = teclado.nextLine();
        }
        System.out.println();
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O " + (i + 1) + "º aluno é: " + alunos[i]);
        }
    }

}
