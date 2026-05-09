package view;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.List;
import model.Funcionario;
import service.FuncionarioService;

public class TelaListaFuncionarios {
    public TelaListaFuncionarios(FuncionarioService service) {
        List<Funcionario> lista = service.listar();
        String[] colunas = {"Matrícula", "Nome", "Cargo", "Salário"};
        Object[][] dados = new Object[lista.size()][4];

        for(int i = 0; i < lista.size(); i++) {
            dados[i][0] = lista.get(i).getMatricula();
            dados[i][1] = lista.get(i).getNome();
            dados[i][2] = lista.get(i).getCargo();
            dados[i][3] = lista.get(i).getSalario();
        }

        
        JTable tabela = new JTable(dados, colunas);
        JScrollPane scroll = new JScrollPane(tabela);

        JOptionPane.showMessageDialog(null, scroll, "Lista de Funcionários", JOptionPane.PLAIN_MESSAGE );
    }
}
