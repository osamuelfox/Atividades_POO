package uniube.conversaoTemperatura;

import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double graus = scanner.nextInt();

        double conversao = (graus * 9/5) + 32;

        System.out.println("A conversao de C° para F° é: " + conversao);

    }
}
