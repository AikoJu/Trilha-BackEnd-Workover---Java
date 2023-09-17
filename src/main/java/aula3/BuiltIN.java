package aula3;
import java.util.concurrent.ThreadLocalRandom;
public class BuiltIN {
    public static void main(String[] args) {

        //1)
        Double x = Math. sqrt(9) + Math.sqrt(100);

        //2)
        Double y = Math.PI * 12;

        //3)Integer Z = Math.random(20);
        Integer numeroRandomico =
                ThreadLocalRandom.current().nextInt(20);
        System.out.println(numeroRandomico);

        //Double numeroRandomicoReal =
                //ThreadLocalRandom.current().nextDouble(1, 20.0);
        //System.out.println(numeroRandomicoReal);

        System.out.println(ThreadLocalRandom.current().nextDouble(20.0));

        //4)
        String a = "brasil".toUpperCase();

        //5)
        String b = "casa";
        int b2 = b.length();

        //System.out.println(x + " " +  y + " " + a + " " + b2);
    }
}
