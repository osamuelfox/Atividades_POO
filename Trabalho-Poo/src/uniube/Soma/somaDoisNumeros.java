package uniube.Soma;

import java.util.Scanner;

public class somaDoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " +  numero1 + " + " + numero2 + " = " + soma);
    }
}