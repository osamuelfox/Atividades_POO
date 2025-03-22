package uniube.NomeCompleto;
import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("O seu nome completo é:  " + nome + " " +sobrenome);

    }
}
