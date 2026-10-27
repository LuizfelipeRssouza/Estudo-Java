package aula11;

import java.util.Scanner;

public class Aula11ex02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("MELHOR ALUNO");
        System.out.println("==============");
        String maiora = "";
        float maiorn = -1;
       System.out.print("Digite o nome do aluno (ou Fim para encerrar): ");
        String aluno = teclado.nextLine();
        while (!aluno.equalsIgnoreCase("Fim")) {
            System.out.print("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();
            teclado.nextLine(); // limpa o Enter que sobrou
            if (nota > maiorn) {
                maiora = aluno;
                maiorn = nota;
            }
            System.out.print("Digite o nome do aluno (ou Fim para encerrar): ");
            aluno = teclado.nextLine();
        }
        if (maiora.isEmpty()) {
            System.out.println("Nenhum aluno foi informado.");
        } else {
            System.out.printf("O aluno com a maior nota é %s, com nota %.2f%n", maiora, maiorn);
        }
    }
    
}
