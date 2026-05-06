package model; 


public class Funcionario implements IFuncionario {

  
    private int matricula;
    private String nome;
    private String cargo;
    private double salario;
    private int dependentes;
    private int filhosMenores14;
    private double valeTransporteDia;

    
    public Funcionario(int matricula, String nome, String cargo,
                       double salario, int dependentes,
                       int filhosMenores14, double valeTransporteDia) {

        this.matricula = matricula;           // "this." = atributo da classe
        this.nome = nome;                     // o valor que veio do parâmetro
        this.cargo = cargo;                   // vai para o atributo
        this.salario = salario;
        this.dependentes = dependentes;
        this.filhosMenores14 = filhosMenores14;
        this.valeTransporteDia = valeTransporteDia;
    }

    
    @Override 
    public int getMatricula() {
        return matricula;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public int getDependentes() {
        return dependentes;
    }

    @Override
    public int getFilhosMenores14() {
        return filhosMenores14;
    }

    @Override
    public double getValeTransporteDia() {
        return valeTransporteDia;
    }

   
    public void setSalario(double salario) {
        this.salario = salario;
    }

  
    @Override
    public String toString() {
        return matricula + " - " + nome + " | " + cargo + " | R$ " + salario;
    }
}
