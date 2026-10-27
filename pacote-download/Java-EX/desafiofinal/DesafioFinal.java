/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiofinal;

import java.util.Scanner;

/**
 *
 * @author luizf
 */
public class DesafioFinal {

    /**
     * @param args the command line arguments
     */
    static final int MAX = 20;
    static Scanner teclado = new Scanner(System.in);
    static String nomes[] = new String[MAX];
    static double notas[] = new double[MAX];
    static int total = 0;   // quantos alunos já foram cadastrados

    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        do {
            mostrarMenu();
            opcao = lerOpcao();
            System.out.println();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    buscarPorNome();
                    break;
                case 4:
                    mostrarMaiorNota();
                    break;
                case 5:
                    mostrarMedia();
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        } while (opcao != 6);
    }

    static void mostrarMenu() {
        System.out.println("CADASTRO DE ALUNOS");
        System.out.println("==================");
        System.out.println("[1] Cadastrar aluno");
        System.out.println("[2] Listar alunos");
        System.out.println("[3] Buscar por nome");
        System.out.println("[4] Mostrar a maior nota");
        System.out.println("[5] Mostrar a média da turma");
        System.out.println("[6] Sair");
        System.out.print("Escolha uma opção: ");
    }

    static void cadastrarAluno() {
        if (total == MAX) {
            System.out.println("ERRO: a turma está cheia (máximo de " + MAX + " alunos).");
            return;
        }
        nomes[total] = lerNome("Nome do aluno: ");
        notas[total] = lerNota();
        total++;
        System.out.println("Aluno cadastrado com sucesso!");
    }

    static void listarAlunos() {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("LISTA DE ALUNOS");
        for (int i = 0; i < total; i++) {
            System.out.printf("%2d. %-20s %5.2f%n", i + 1, nomes[i], notas[i]);
        }
    }

    static void buscarPorNome() {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        String busca = lerNome("Nome (ou parte do nome) a buscar: ").toLowerCase();
        boolean achou = false;
        for (int i = 0; i < total; i++) {
            if (nomes[i].toLowerCase().contains(busca)) {
                System.out.printf("%-20s %5.2f%n", nomes[i], notas[i]);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum aluno encontrado com esse nome.");
        }
    }

    static void mostrarMaiorNota() {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        double maior = notas[0];
        for (int i = 1; i < total; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.printf("Maior nota: %.2f%n", maior);
        for (int i = 0; i < total; i++) {
            if (notas[i] == maior) {
                System.out.println("Aluno: " + nomes[i]);
            }
        }
    }

    static void mostrarMedia() {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += notas[i];
        }
        System.out.printf("Média da turma: %.2f%n", soma / total);
    }

    // ---------- leitura com validação ----------
    static int lerOpcao() {
        try {
            return Integer.parseInt(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;   // cai no "Opção inválida"
        }
    }

    static String lerNome(String pergunta) {
        while (true) {
            System.out.print(pergunta);
            String nome = teclado.nextLine().trim();
            if (!nome.isEmpty()) {
                return nome;
            }
            System.out.println("ERRO: o nome não pode ficar vazio.");
        }
    }

    static double lerNota() {
        while (true) {
            System.out.print("Nota (0 a 10): ");
            String texto = teclado.nextLine().trim().replace(",", ".");
            try {
                double nota = Double.parseDouble(texto);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
                System.out.println("ERRO: a nota deve estar entre 0 e 10.");
            } catch (NumberFormatException e) {
                System.out.println("ERRO: digite um número válido.");
            }
        }
    }
}
