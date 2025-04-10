public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario = salario * (salario * porcentagem / 100);
    }

    public void aumentarSalario(String cargo, double porcentagem) {
        if (cargo.equalsIgnoreCase(this.cargo)) {
            salario = salario * (salario * porcentagem / 100);
        }
    }

    public void promover(String cargo) {
        this.cargo = cargo;
    }
}
