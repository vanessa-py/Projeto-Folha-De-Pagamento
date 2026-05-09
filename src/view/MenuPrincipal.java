package view;
 import javax.swing.JOptionPane;
 import service.FuncionarioService;


public class MenuPrincipal {

    private FuncionarioService service;

    public MenuPrincipal(FuncionarioService service) {
        this.service = service;

        int opcao = 0;
        do {

            String menu = "==== Folha de Pagamento ====\n\n"
            + "1. Incluir Funcionário\n"
            + "2. Listar Funcionários\n"
            + "3. Calcular Folha de Pagamento\n"
            + "4. Sair";

            String leitura = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.QUESTION_MESSAGE);

            if(leitura == null) break;
            opcao = Integer.parseInt(leitura);

            switch (opcao) {
                case 1:
                    new TelaCadastroFuncionario(service);    
                    break;
                case 2:
                    new TelaListaFuncionarios(service);
                    break;
                case 3:
                    new TelaFolhaPagamento(service);
                    break;    

                 case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while(opcao != 4);
    }
}
