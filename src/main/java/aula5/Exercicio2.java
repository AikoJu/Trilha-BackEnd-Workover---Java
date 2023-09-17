package aula5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        Double salario = in.nextDouble();

        System.out.println("Quantas vendas fez este mês?");
        Integer vendas = in.nextInt();

        Double comissao = vendas * 0.15;

        Double salarioFinal = salario + comissao;

        System.out.println("""
                Você recebe: R$%.2f
                com %d de vendas
                Sua  comissão este mês foi de: R$%.2f
                Então seu salário final é de: R$%.2f
                """.formatted(salario, vendas, comissao, salarioFinal));

    }
}
