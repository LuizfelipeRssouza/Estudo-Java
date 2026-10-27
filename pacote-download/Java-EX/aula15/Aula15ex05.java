package aula15;

public class Aula15ex05 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("FIBONACCI FUNCAO");
        System.out.println("=================");
        int t1 = 0, t2 = 1;
        System.out.printf("%d%n%d%n", t1, t2);
        for(int i = 3; i <= 10; i++){
            int aux = fibonacci(t1, t2);
            System.out.println(aux);
            t1 = t2;
            t2 = aux;
        }
    }
    static int fibonacci(int a, int b){
       return a + b;
    }
}
