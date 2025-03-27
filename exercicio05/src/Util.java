
import javax.swing.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;

public class Util {
    private BilheteUnico[] bilhete = new BilheteUnico[5];
    private int index = 0;

    public void menuPrincipal(){
        int opcao;
        String menu = "1. Administrador\n2. Usuário\n3. Finalizar";
        do { 
            opcao = parseInt(showInputDialog(menu));
            switch(opcao){
                case 1 -> menuAdministrador();
                case 2 -> menuUsuario();
                case 3 -> {
                    showMessageDialog(null, "Finalizando...");
                }
                default -> erro();
            }

        } while (opcao != 3); 
    }

    private void menuAdministrador(){
        int opcao;
        String menu = "MENU ADMINISTRADOR\n";
        menu += "1. Emitir Bilhete\n2. Listar Bilhetes\n3. Excluir Bilhete\n4. Retornar";

        do{
            opcao = parseInt(showInputDialog(menu));

            switch (opcao) {
                case 1 -> emitirBilhete();
                case 2 -> listarBilhetes();
                case 3 -> excluirBilhete();
                case 4 -> retornar();
                default -> erro();
            }
        } while(opcao != 4);
    }

    private void menuUsuario(){
        int opcao;
        String menu = "MENU USUÁRIO\n";
        menu += "1. Carregar bilhete \n2. Consultar saldo \n3. Passar na catraca \n 4. Retornar";

        do{
            opcao = parseInt(showInputDialog(menu));

            switch (opcao){
                case 1:
                    carregarBilhete();
                    break;
                case 2:
                   consultarSaldo();
                    break;

                case 3:
                   passarCatraca();
                    break;
                case 4:
                    retornar();
                    break;
                default:
                    erro();
            }

                    } while(opcao != 4);
        
    }

    // GERAL
    private void erro(){
        showMessageDialog(null, "Error, not a valid input");
    }

    private void retornar(){
        showMessageDialog(null, "Retornando...");
    }

    private int pesquisar(){
        long cpf = parseLong(showInputDialog("Digite o CPF (ex: 123456789) "));
        for(int i = 0; i < index; i ++){
            if(bilhete[i].usuario.cpf == cpf){
                return i;
            }
        }
        showMessageDialog(null, + cpf + "não encontrado, tente novamente");
        return -1;
    }

    // ADMINISTRADOR
    private void emitirBilhete(){
        if (index < bilhete.length) {
            String nome = showInputDialog("Digite seu nome\n");
        long cpf = parseLong(showInputDialog("Digite seu cpf\n"));
        String perfil = showInputDialog("Digite seu tipo de bilhete único\n ( Comum, Estudante ou Professor )\n");
        bilhete[index] = new BilheteUnico(nome, cpf, perfil);
        index++;
        } else{
            System.out.println("Procure o posto da SPTrans");
        }
    }

    private void listarBilhetes(){
        DecimalFormat df = new DecimalFormat("0.00");
        String listaBilhetes = "LISTA DE BILHETES\n";
        for(int i = 0; i < index; i++){
            listaBilhetes += "user: "+ bilhete[i].usuario.nome;
            listaBilhetes += "\ncpf: "+ bilhete[i].usuario.cpf;
            listaBilhetes += "\ntipo: "+ bilhete[i].usuario.perfil;
            listaBilhetes += "\nnum: "+ bilhete[i].numero;
            listaBilhetes += "\nsaldo: "+ df.format(bilhete[i].saldo);
            listaBilhetes += "\n-------------------------\n";
        }
        showMessageDialog(null, listaBilhetes);
    }

    public void excluirBilhete(){
        int indice = pesquisar();
        int resposta;

        if(indice != -1){
            resposta = showConfirmDialog(null, "Você tem certeza que deseja deletar o bilhete com o cpf ("+ bilhete[indice].usuario.cpf + "?");
            if(resposta == YES_OPTION){
                bilhete[indice] = bilhete[index-1];
                bilhete[index-1] = null;
                index--;
            }
        }
    }

    // USUÁRIO
    public void carregarBilhete(){
       int indice = pesquisar();
       double valor;
       if(indice != -1){
           valor = parseDouble(showInputDialog("Insira o valor da recarga"));
           bilhete[indice].carregarSaldo(valor);
       }
    }

    public void consultarSaldo(){
        int indice = pesquisar();
        if(indice != -1){
            showMessageDialog(null, "Saldo do CPF ("+ bilhete[indice].usuario.cpf+ "): R$ "+ bilhete[indice].consultarSaldo());
        }
    }

    public void passarCatraca(){
        int indice = pesquisar();
        if(indice != -1){
            showInputDialog(null, bilhete[indice].passarCatraca());
        }

    }




}
