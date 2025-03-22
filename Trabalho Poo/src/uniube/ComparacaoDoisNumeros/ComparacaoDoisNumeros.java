package uniube.ComparacaoDoisNumeros;
import java.util.Scanner;

public class ComparacaoDoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){

            System.out.println(numero1 + " Maior que " + numero2 );

        }else {
            System.out.println(numero1 + " Menor que " + numero2 );
        }
    }
}
