package aula13;

public class Aula13ex01 {

    public static void main(String[] args) {
        System.out.println("FIBONACCI");
        System.out.println("=========");
        int a = 0, b = 1, aux;
        for(int i = 0; i < 15; i++){
            System.out.print(a + " ");
            aux = a + b;
            a = b;
            b = aux;
        }
    }
    
}
