
import java.util.Random;

public class BilheteUnico {

    static final double TARIFA = 5.20;
    double saldo = 0;
    long numero;
    Usuario usuario;

    public BilheteUnico(String nome, long cpf, String perfil) {
        Random random = new Random();
        numero = random.nextLong(1, 1000000);
        usuario = new Usuario(nome, cpf, perfil);
    }

    public double carregarSaldo(double qtd) {
        saldo += qtd;
        return saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String passarCatraca() {
        double debito = TARIFA / 2;
        if (usuario.perfil.equalsIgnoreCase("comum")) {
            debito = TARIFA;
        }
        if (saldo >= debito) {
            saldo -= debito;
            return "catraca liberada";
        }
        return "Saldo insuficiente";
    }


}
