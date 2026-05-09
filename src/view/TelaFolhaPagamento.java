package view;
import javax.swing.JOptionPane;
import model.Funcionario;
import service.FuncionarioService;
import service.CalculadoraFolha;

public class TelaFolhaPagamento {

    public TelaFolhaPagamento(FuncionarioService service) {

    String entrada = JOptionPane.showInputDialog(null, "Digite a matrícula do Funcionário:");
    if(entrada == null) return;
    int matricula = Integer.parseInt(entrada);

    Funcionario encontrado = null;
    for(Funcionario f : service.listar()) {
        if(f.getMatricula() == matricula){
            encontrado = f;
            break;
        }
    }

    if(encontrado == null){
        JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
        return;
    }

    CalculadoraFolha calc = new CalculadoraFolha();
    double inss  = calc.calcularINSS(encontrado);
    double vt    = calc.calcularValeTransporte(encontrado);
    double sf    = calc.calcularSalarioFamilia(encontrado);
    double irrf  = calc.calcularIRRF(encontrado);
    double fgts  = calc.calcularFGTS(encontrado);
    double liquido = calc.calcularSalarioLiquido(encontrado); // ela já fez esse método!
   
    String holerite = "===== HOLERITE =====\n"
            + "Nome:              " + encontrado.getNome()   + "\n"
            + "Cargo:             " + encontrado.getCargo()  + "\n"
            + "Salário Bruto:   R$" + encontrado.getSalario()+ "\n"
            + "--------------------\n"
            + "INSS:           -R$" + inss   + "\n"
            + "IRRF:           -R$" + irrf   + "\n"
            + "Vale Transporte:-R$" + vt     + "\n"
            + "Salário Família:+R$" + sf     + "\n"
            + "FGTS (depósito): R$" + fgts   + "\n"
            + "--------------------\n"
            + "Salário Líquido: R$" + liquido;

    JOptionPane.showMessageDialog(null, holerite, "Folha de pagamento", JOptionPane.PLAIN_MESSAGE);

    }

}