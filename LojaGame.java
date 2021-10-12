import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cadastro, login, feedJogos, carrinho, comprar;
        
        System.out.println("Entrar no App");
        cadastro = input.nextBoolean();
        if (cadastro == true) {
            System.out.println("Login");
            login = input.nextBoolean();
            System.out.println("Menu Usuario");
            feedJogos = input.nextBoolean();
            if (feedJogos == true) {
                System.out.println("Escolher Jogo");
            }
            carrinho = input.nextBoolean();
            System.out.println("Inserir dados de compra");
            comprar = input.nextBoolean();
            System.out.println("Compra realizada com SUCESSO!!! ENJOY!");
        } else {
            if ("Deseja Cadastrar?") {
                int cadastroUsuario;
            
            }
        }
    }
}
