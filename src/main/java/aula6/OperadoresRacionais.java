package aula6;

public class OperadoresRacionais {
    public static void main(String[] args) {
        Boolean primeiro = 15 > 10;
        Boolean segundo = 15 > 10 + 5 ;
        Boolean terceiro = 7 > 10 && 15 > 15 ;
        Boolean quarto =  15 != 10;
        Boolean quinto =  !(15 < 10);
        Boolean sexto =  15 == 10 || 15 > 10;
        Boolean sete = 2 * 15 > 4 * 10 ;




        System.out.println("""
                %b
                %b
                %b
                %b
                %b
                %b
                %b
                """.formatted(primeiro,segundo,terceiro,quarto,quinto,sexto,sete));
    }
}
