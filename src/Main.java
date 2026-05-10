import service.FuncionarioService;
import view.MenuPrincipal;

public class Main {  // o main decide quando o sistema inicia

    public static void main(String[] args) {

        FuncionarioService service = new FuncionarioService(); //  um espaço na memória do computador é criado para guardar todos os funcionários que serão manipulados enquanto o programa estiver aberto

        service.carregarDadosIniciais(); // o main chama esse metodo e pega os objetos prontos
        // service indica o endereço que o metodo carregardadosIniciais esta

        new MenuPrincipal(service); // liga a intergace grafica 
                                    // service é o objeto que contém os funcionario; O Service decide como os dados são guardados.
    }
}
