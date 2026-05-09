package service;

import model.Funcionario;

public class CalculadoraFolha{

    public double calcularINSS(Funcionario f) {

        double salario = f.getSalario();
        if (salario <= 1412.00) {
            return salario * 0.075;
        } else if (salario <= 2666.68) {
            return salario * 0.09;
        } else if (salario <= 4000.03) {
            return salario * 0.12;
        } else if (salario <= 7786.02) {
            return salario * 0.14;
        } else {
        System.out.println("Salário não é válido");
        }
        return 0;

    }

    
    public double calcularIRRF(Funcionario f) {

        double salario = f.getSalario();
        if (salario <= 2259.20) {
            return 0;
        } else if (salario <= 2826.65) {
            return salario * 0.075 - 169.44;
        } else if (salario <= 3751.05) {
            return salario * 0.15 - 381.44;
        } else if (salario <= 4664.68) {
            return salario * 0.225 - 662.77;
        } else {
            return salario * 0.275 - 896.00;
        }

    }


    public double calcularValeTransporte(Funcionario f) {
        
        double valorDiarioIdaVolta = 12.00; 
        double custoTotalMes = valorDiarioIdaVolta * 20;
        double desconto = f.getSalario() * 0.06;

        return Math.min(custoTotalMes, desconto);
    }


    public double calcularSalarioFamilia (Funcionario f) {

        double salario = f.getSalario();
        double filhoMenor14 = f.getFilhosMenores14();
        if (salario <= 1819.26){
            return filhoMenor14 * 62.04;
        } else {
            System.out.println("Salário acima do limite");
            return 0;
        }

    }


    public double calcularFGTS (Funcionario f){

        double salario = f.getSalario();
        double fgts = salario * 0.08;
        return fgts;

    }


    public double calcularSalarioLiquido (Funcionario f) {

        double salarioBruto = f.getSalario();
        double inss = calcularINSS(f);
        double irrf = calcularIRRF(f);
        double valeTransporte = calcularValeTransporte(f);
        double salarioFamilia = calcularSalarioFamilia(f);

        return salarioBruto - inss - irrf - valeTransporte + salarioFamilia;

    }

}