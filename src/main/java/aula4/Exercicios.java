package aula4;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("""
                **************************************
                *                                    *      
                *                                    *
                *             SOU FELIZ              *
                *                                    *
                *                                    *
                **************************************
                """);


        System.out.println("Qual seu nome?");
        String nome = in.next();
        System.out.println(String.format("%s, você teria um minuto para falar comigo?",nome));

        Double raio = 0.0;

        System.out.println("Informe o raio: ");
        raio = in.nextDouble();

        Double resposta = (4 * Math.PI *  Math.pow(raio,3))/3 ;

        System.out.println(resposta);


    }
}
