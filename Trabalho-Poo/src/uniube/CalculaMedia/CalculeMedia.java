package uniube.CalculaMedia;
import java.util.Scanner;

public class CalculeMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite nota 3: ");
        int nota3 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das notas é:  " +  media);
    }
}
