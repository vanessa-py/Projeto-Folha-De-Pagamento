package service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import model.Funcionario;

public class CalculadoraFolha {

    public BigDecimal calcularINSS(Funcionario f) {
        // Converte o double para BigDecimal para iniciar o cálculo
        BigDecimal salario = BigDecimal.valueOf(f.getSalario());
        BigDecimal imposto;

        if (salario.compareTo(new BigDecimal("1412.00")) <= 0) {
            imposto = salario.multiply(new BigDecimal("0.075"));
        } else if (salario.compareTo(new BigDecimal("2666.68")) <= 0) {
            imposto = salario.multiply(new BigDecimal("0.09"));
        } else if (salario.compareTo(new BigDecimal("4000.03")) <= 0) {
            imposto = salario.multiply(new BigDecimal("0.12"));
        } else {
            imposto = salario.multiply(new BigDecimal("0.14"));
        }
        return imposto.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularIRRF(Funcionario f) {
        BigDecimal salario = BigDecimal.valueOf(f.getSalario());
        BigDecimal imposto;

        if (salario.compareTo(new BigDecimal("2259.20")) <= 0) {
            imposto = BigDecimal.ZERO;

        } else if (salario.compareTo(new BigDecimal("2826.65")) <= 0) {
            imposto = salario.multiply(new BigDecimal("0.075")).subtract(new BigDecimal("169.44"));

        } else if (salario.compareTo(new BigDecimal("3751.05")) <= 0) {
            imposto = salario.multiply(new BigDecimal("0.15")).subtract(new BigDecimal("381.44"));

        } else if (salario.compareTo(new BigDecimal("4664.68")) <= 0) {
            imposto = salario.multiply(new BigDecimal("0.225")).subtract(new BigDecimal("662.77"));

        } else {
            imposto = salario.multiply(new BigDecimal("0.275")).subtract(new BigDecimal("896.00"));
        }
        return imposto.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularValeTransporte(Funcionario f) {
        
        BigDecimal custoTotalMes = new BigDecimal("12.00").multiply(new BigDecimal("20"));
        BigDecimal tetoDesconto = BigDecimal.valueOf(f.getSalario()).multiply(new BigDecimal("0.06"));

        // Retorna o menor entre o custo e o teto de 6%
        return custoTotalMes.min(tetoDesconto).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularSalarioFamilia(Funcionario f) {
        BigDecimal salario = BigDecimal.valueOf(f.getSalario());
        if (salario.compareTo(new BigDecimal("1819.26")) <= 0) {
            return new BigDecimal(f.getFilhosMenores14()).multiply(new BigDecimal("62.04")).setScale(2, RoundingMode.HALF_UP);
        }
        return BigDecimal.ZERO;
    }

    public BigDecimal calcularFGTS(Funcionario f) {
        return BigDecimal.valueOf(f.getSalario()).multiply(new BigDecimal("0.08")).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularSalarioLiquido(Funcionario f) {
        BigDecimal bruto = BigDecimal.valueOf(f.getSalario());
        
        // Subtrai descontos e soma benefícios
        return bruto.subtract(calcularINSS(f))
                    .subtract(calcularIRRF(f))
                    .subtract(calcularValeTransporte(f))
                    .add(calcularSalarioFamilia(f))
                    .setScale(2, RoundingMode.HALF_UP);
    }
}
