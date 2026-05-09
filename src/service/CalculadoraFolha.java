package service;
import java.math.BigDecimal;
import model.Funcionario;

public class CalculadoraFolha{

    public BigDecimal calcularINSS(Funcionario f) {

        BigDecimal salario = f.getSalario();

        if (salario.compareTo(new BigDecimal("1412.00")) <= 0) {

            return salario.multiply(new BigDecimal("0.075"));

        }else if (salario.compareTo(new BigDecimal("2666.68")) <= 0) {

            return salario.multiply(new BigDecimal("0.09"));

        }else if (salario.compareTo(new BigDecimal("4000.03")) <= 0) {

            return salario.multiply(new BigDecimal("0.12"));

        } else if (salario.compareTo(new BigDecimal("7786.02")) <= 0) {

            return salario.multiply(new BigDecimal("0.14"));

        } else {

            System.out.println("Salário não é válido");

            return BigDecimal.ZERO;

        }

    }

    
    public BigDecimal calcularIRRF(Funcionario f) {

        BigDecimal salario = f.getSalario();

        if (salario.compareTo(new BigDecimal("2259.20")) <= 0) {

            return BigDecimal.ZERO;

        } else if (salario.compareTo(new BigDecimal("2826.65")) <= 0) {

            return salario.multiply(new BigDecimal("0.075")).subtract(new BigDecimal("169.44"));

        } else if (salario.compareTo(new BigDecimal("3751.05")) <= 0) {

            return salario.multiply(new BigDecimal("0.15")).subtract(new BigDecimal("381.44"));

        } else if (salario.compareTo(new BigDecimal("4664.68")) <= 0) {

            return salario.multiply(new BigDecimal("0.225")).subtract(new BigDecimal("662.77"));

        } else {

            return salario.multiply(new BigDecimal("0.275")).subtract(new BigDecimal("896.00"));
            
        }
    }


    public BigDecimal calcularValeTransporte(Funcionario f) {

        BigDecimal valorDiarioIdaVolta = new BigDecimal("12.00");
        BigDecimal custoTotalMes = valorDiarioIdaVolta.multiply(new BigDecimal("20"));
        BigDecimal desconto = f.getSalario().multiply(new BigDecimal("0.06"));

        return custoTotalMes.min(desconto);

    }


    public BigDecimal calcularSalarioFamilia(Funcionario f) {

        BigDecimal salario = f.getSalario();
        BigDecimal filhosMenores14 = new BigDecimal(f.getFilhosMenores14());

        if (salario.compareTo(new BigDecimal("1819.26")) <= 0) {

            return filhosMenores14.multiply(new BigDecimal("62.04"));

        } else {

            System.out.println("Salário acima do limite");
            return BigDecimal.ZERO;

        }
    }


    public BigDecimal calcularFGTS(Funcionario f) {

        return f.getSalario().multiply(new BigDecimal("0.08"));

    }


    public BigDecimal calcularSalarioLiquido(Funcionario f) {

        BigDecimal salarioBruto = f.getSalario();
        BigDecimal inss = calcularINSS(f);
        BigDecimal irrf = calcularIRRF(f);
        BigDecimal valeTransporte = calcularValeTransporte(f);
        BigDecimal salarioFamilia = calcularSalarioFamilia(f);

        return salarioBruto.subtract(inss).subtract(irrf).subtract(valeTransporte).add(salarioFamilia);
    }

}
