package aula14;

import java.util.Scanner;

public class aula14ex02 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("NOMES COM C");
        System.out.println("===========");
        Scanner teclado = new Scanner(System.in);
        String alunos[] = new String[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            alunos[i] = teclado.nextLine();
        }
        System.out.println();
        int achados = 0;
        for (String nome : alunos) {
            if (nome.toUpperCase().startsWith("C")) {
                System.out.println(nome);
                achados++;
            }
        }
        if (achados == 0) {
            System.out.println("Nenhum nome começa com C.");
        }
    }
    
}
