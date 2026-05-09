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
    double inss = calc.calcularINSS(encontrado.getSalario());
    double vt = calc.calcularValeTransporte(encontrado.getSalario(),encontrado.getValeTransporteDia());
    double sf = calc.calcularSalarioFamilia(encontrado.getSalario(),encontrado.getFilhosMenores14());
    double irrf = calc.calcularIRRF(encontrado.getSalario(),encontrado.getDependentes());
    double fgts = calc.calcularFGTS(encontrado.getSalario());
    double liquido = encontrado.getSalario() - inss - vt - irrf + sf;

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