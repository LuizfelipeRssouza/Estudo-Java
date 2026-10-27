package aula6;

import java.util.Scanner;

public class Aula6ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ficha Cadastral de uma empresa");
        System.out.print("Digite o NOME do funcionario: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a IDADE do funcionario: ");
        int idade = teclado.nextInt();
        teclado.nextLine(); // limpa o Enter que sobrou
        System.out.print("Digite o SEXO do funcionario: ");
        String sex = teclado.nextLine();
        System.out.print("Digite o SALÁRIO do funcionario: ");
        float sal = teclado.nextFloat();
        System.out.printf("O funcionario %s tem %d anos, é do sexo %s e tem o salário de %.2f%n", nome, idade, sex, sal);
    }
}
