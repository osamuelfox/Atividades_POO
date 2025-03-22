package uniube.ValorAbsoluto;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();

        int valorAbsoluto;
        if (numero < 0) {
            valorAbsoluto = -numero;

        } else {
            valorAbsoluto = numero;

        }

        System.out.println("O valor absoluto do número é: " + valorAbsoluto);
    }
}
