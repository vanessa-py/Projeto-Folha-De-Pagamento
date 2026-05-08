package service;

import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

public class FuncionarioService {

    private List<Funcionario> lista = new ArrayList<>();   // indica que essa lista só irá aceitar objeto do tipo funcionario

    public void carregarDadosIniciais() {


        // CARGA INICIAL OBRIGATÓRIA

        lista.add(new Funcionario(1, "Ana Silva", "Analista", 3000, 2, 1, 8.5));
        lista.add(new Funcionario(2, "Bruno Souza", "Dev", 5000, 1, 1, 10));
        lista.add(new Funcionario(3, "Carlos Lima", "Suporte", 1800, 3, 2, 6));
        lista.add(new Funcionario(4, "Daniela Rocha", "Gerente", 8000, 0, 0, 12));
        lista.add(new Funcionario(5, "Eduardo Alves", "Estagiário", 1200, 0, 0, 5));
    }

    public void adicionar(Funcionario f) { // recebe um funcionario e adiciona na lista; recebe o metodo funcionario
        lista.add(f);                      // adiciona o funcionario na lista(f é a variavel criada)
    }

    public List<Funcionario> listar() {  // mostra a lista funcionario inteira; listar() = nome do metodo
        return lista;                     // entrega a lista que o metodo chamou
    }
}
