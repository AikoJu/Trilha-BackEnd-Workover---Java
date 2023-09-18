package aula7;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        Integer numeroUsuario = in.nextInt();

        if (numeroUsuario == 10) {
            System.out.println("PARABÉNS!");
        } else {
            System.out.println("ERRRROOOOOOUUUUU");
        }


        Integer numero = in.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        };

        System.out.println("Usuário:");
        String usuario = in.next();
        System.out.println("Senha:");
        String senha = in.next();

        if((usuario.equals("Admin") && senha.equals("123")) || ((usuario.equals("Aluno") && senha.equals("999")))){
            System.out.println("Bem vindo(a) " + usuario);
        }else{
            System.out.println("Seu usuário e/ou senha estão incorretos!");
        }

    }
}
