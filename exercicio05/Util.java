
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;

public class Util {
    private BilheteUnico[] bilhete = new BilheteUnico[5];
    private int index = 0;


    public void menuPrincipal(){
        int opcao;
        String menu = "1. Administrador\n 2. Usuário\n 3. Finalizar";
        do { 
            opcao = parseInt(showInputDialog(menu));
            switch(opcao){
                case 1 -> menuAdministrador();
                case 2 -> menuUsuario();
                case 3 -> {
                    showMessageDialog(null, "Finalizando...");
                }
                default -> error();
            }

        } while (opcao != 3); 
    }

    private void menuAdministrador(){
        int opcao;
        String menu = "MENU ADMINISTRADOR\n";
        menu += "1. Emitir Bilhete\n 2. Listar Bilhetes\n 3. Excluir Bilhete\n 4. Retornar";

        do{
            opcao = parseInt(showInputDialog(menu));

            switch (opcao) {
                case 1 -> emitirBilhete();
                case 2 -> listarBilhetes();
                case 3 -> excluirBilhete();
                case 4 -> retornar();
                default -> error();
            }
        } while(opcao != 4);
    }

    private void menuUsuario(){
        int opcao;
        String menu = "MENU USUÁRIO\n";
        menu += "";
        showInputDialog(menu);

        do{
            opcao = parseInt(showInputDialog(menu));

           
            // espaço reservado para switch
                    } while(opcao != 4);
        
    }
   
    private void error(){
        showMessageDialog(null, "Error, not a valid input");
    }

    private void retornar(){
        showMessageDialog(null, "Retornando...");
    }

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
        // fazer na próxima aula
    }


}
