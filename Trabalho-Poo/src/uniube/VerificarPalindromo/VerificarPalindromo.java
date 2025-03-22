package uniube.VerificarPalindromo;

import java.util.Scanner;

public class VerificarPalindromo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                System.out.println("Não é palíndromo");
                break;
            }else {
                System.out.println("É palíndromo");
                break;
            }
        }
    }
}
