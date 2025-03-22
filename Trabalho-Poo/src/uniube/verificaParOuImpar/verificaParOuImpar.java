package uniube.verificaParOuImpar;

import java.util.Scanner;

public class verificaParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();

        if (numero1 % 2 == 0) {

            System.out.println("Par");

        }else{

            System.out.println("Impar");
        }


    }
}
