package uniube.CalcularIdade;
import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = scanner.nextInt();

        int idade = 2025 - ano;

        System.out.println("Sua idade é " + idade);
    }
}
