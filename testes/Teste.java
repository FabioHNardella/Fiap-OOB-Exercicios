import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        int num[] = new int[5];
        carregarDados(num);
        imprimir(num);


    }

    public static void imprimir(int[] x){
        for (int i : x) {
            System.out.println(i);
        }
    }

    public static void carregarDados(int[] x){
        Random rand = new Random();

        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(15);
        }
    }

    

}
