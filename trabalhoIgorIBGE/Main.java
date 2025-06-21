
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Blog de noticias do IBGE ");
        System.out.print("Digite seu nome/apelido: ");
        String nome = sc.nextLine();

        Usuario usuario = Persistencia.carregar(nome);
        Sistema sistema = new Sistema(usuario);
        sistema.menu();
        Persistencia.salvar(usuario);
    }
}
