
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


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
                    showMessageDialog(null, "Retornando ao menu anterior");
                }
                default -> error();
            }

        } while (opcao != 3); 
    }

    private void menuAdministrador(){
        int opcao;
        String menu = "MENU ADMINISTRADOR\n";
        menu += "1. Emitir Bilhete\n 2. Listar Bilhetes\n 3. Excluir Bilhete\n 4. Sair";
        showInputDialog(menu);

        do{
            opcao = parseInt(showInputDialog(menu));

            // espaço reservado para switch
        } while(opcao != 4);
    }

    private void menuUsuario(){
        int opcao;
        String menu = "MENU USUÁRIO\n";
        menu += "1. Emitir Bilhete\n 2. Listar Bilhetes\n 3. Excluir Bilhete\n 4. Sair";
        showInputDialog(menu);

        do{
            opcao = parseInt(showInputDialog(menu));

            // espaço reservado para switch
        } while(opcao != 4);
        
    }

    private void error(){
        showMessageDialog(null, "Error, not a valid input");
    }


}
