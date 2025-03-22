package uniube.AreaRetangulo;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite base: ");
        int base = scanner.nextInt();

        System.out.println("Digite altura: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("Area " + area);
    }
}
