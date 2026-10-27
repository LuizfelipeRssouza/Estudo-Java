package aula15;

public class Aula15ex04 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("FATORIAL");
        System.out.println("=========");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "! = " + fatorial(i));
        }
    }

    static long fatorial(int n) {
        long resultado = 1;
        for (int c = 1; c <= n; c++) {
            resultado *= c;
        }
        return resultado;
    }
}
