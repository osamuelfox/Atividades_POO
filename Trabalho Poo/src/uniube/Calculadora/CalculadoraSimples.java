package uniube.Calculadora;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int sub = numero1 - numero2;
        int mult = numero1 * numero2;
        double div = numero1 / numero2;

        System.out.println("Soma " +soma);
        System.out.println("Subtracao " +sub);
        System.out.println("Multiplicacao " +mult );
        System.out.println("Divisao " + div);


    }


}
