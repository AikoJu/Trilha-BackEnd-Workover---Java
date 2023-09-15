package aula1;

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeUsuario;
        Integer idadeUsuario;
        Double salarioUsuario;

        System.out.println("Qual seu nome?");
        nomeUsuario = in.next();

        System.out.println("E sua idade?");
        idadeUsuario = in.nextInt();

        System.out.println("E quanto você recebe?");
        salarioUsuario = in.nextDouble();

        System.out.println("""
                Olá %s, você tem %d anos e recebe R$%.2f de salário.
                """.formatted(nomeUsuario,idadeUsuario,salarioUsuario));
    }
}
