package view;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Funcionario;
import service.FuncionarioService;

public class TelaCadastroFuncionario {
    private FuncionarioService service;

    public TelaCadastroFuncionario(FuncionarioService service) {
        this.service = service;

        JTextField campoNome = new JTextField();
        JTextField campoCargo = new JTextField();
        JTextField campoSalario = new JTextField();
        JTextField campoDep = new JTextField();
        JTextField campoFilhos = new JTextField();
        JTextField campoVT = new JTextField();

        Object[] formulario = {
            "Nome:",            campoNome,
            "Cargo:",           campoCargo,
            "Salário:",         campoSalario,
            "Dependentes:",      campoDep,
            "Filhos < 14:",     campoFilhos,
            "Vale Transp/dia:", campoVT,

        };

        int result = JOptionPane.showConfirmDialog(null,
             formulario, "Cadastrar Funcionário", JOptionPane.OK_CANCEL_OPTION);

             if(result == JOptionPane.OK_OPTION) {
                String nome = campoNome.getText();
                String cargo = campoCargo.getText();
                double salario = Double.parseDouble(campoSalario.getText());
                int dep = Integer.parseInt(campoDep.getText());
                int filhos = Integer.parseInt(campoFilhos.getText());
                double vt = Double.parseDouble(campoVT.getText());

                int matricula = service.listar().size() +1;
                Funcionario f = new Funcionario(matricula, nome, cargo, salario, dep, filhos, vt);
                service.adicionar(f);

                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
             }

    }

    
}