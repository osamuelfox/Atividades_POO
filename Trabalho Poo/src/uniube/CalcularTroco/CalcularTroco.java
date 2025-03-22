package uniube.CalcularTroco;
import java.util.Scanner;

public class CalcularTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double compra = scanner.nextDouble();

        System.out.println("Digite o valor que foi dado ao vendedor: ");
        double valor = scanner.nextDouble();

        double troco = valor - compra;

        System.out.println("O seu troco é de R$ " +  troco);

    }
}
