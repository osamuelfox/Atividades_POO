package uniube.ContagemRegressiva;
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int cont = numero; cont >= 0; cont--){
            System.out.println("Contagem " + cont);
        }
    }
}
