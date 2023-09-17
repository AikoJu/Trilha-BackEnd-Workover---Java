package aula5;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        Double numero30 = in.nextDouble();

        System.out.println("Digite o segundo número:");
        Double numero25 = in.nextDouble();

        numero30 += numero30 * 0.3;
        numero25 -= numero25 * 0.25;

        System.out.println(numero30 + " " + numero25);


    }
}
