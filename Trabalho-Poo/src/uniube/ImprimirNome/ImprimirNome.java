package uniube.ImprimirNome;

import java.util.Scanner;

public class ImprimirNome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá, "+ nome);


    }
}
