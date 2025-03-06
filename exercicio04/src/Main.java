import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String nome, cargo;
        double salario, porcentagem;
        Funcionario f;
        System.out.println("Nome do funcionário: ");
        nome = sc.next();
        System.out.println("Cargo do funcionário: ");
        cargo = sc.next();
        System.out.println("Salário do funcionário: ");
        salario = sc.nextDouble();
        f = new Funcionario(nome, cargo, salario);

        System.out.println("Digite a porcentagem de aumento ( 0 - 100 ): ");
        porcentagem = sc.nextDouble();
        f.aumentarSalario(porcentagem);
        System.out.println("Novo salário R$ " + f.salario);

        System.out.println("Digite a porcentagem de aumento ( 0 - 100 ): ");
        porcentagem = sc.nextDouble();
        System.out.println("Digite o cargo que terá aumento: ");
        cargo = sc.next();
        f.aumentarSalario(cargo, porcentagem);
        System.out.println("Novo salário R$ " + f.salario);
    }
}
