public class Teste2 {
    public static void main(String[] args) {
        System.out.println("\nsoma = "+ somar(2, 3));
        System.out.println("soma = "+ somar(2, 3, 4));
        System.out.println("soma = "+ somar(2, 3, 5, 1, 7));
    }
    public static int somar(int ...x){
        int soma = 0;
        for (int i : x) {
            soma += i;
        }
        return soma;
    }
}
